package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Book");
        Product product1 = new Product("Newspapers");

        Item item = new Item(product, new BigDecimal(56 * 2), 2, new BigDecimal(56));
        Item item1 = new Item(product, new BigDecimal(43 * 6), 6, new BigDecimal(43));
        Item item2 = new Item(product1, new BigDecimal(15 * 10), 10, new BigDecimal(15));

        Invoice invoice = new Invoice("1");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);

        //Then
        assertNotEquals(0, invoice.getId());

        //CleanUp
        invoiceDao.deleteAll();
        itemDao.deleteAll();
        productDao.deleteAll();

    }
}
