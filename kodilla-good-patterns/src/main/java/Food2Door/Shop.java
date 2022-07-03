package Food2Door;

import java.time.LocalDateTime;

public class Shop implements OrderingService {
    @Override
    public boolean order(final Product product, final LocalDateTime productOrderedTime, final Producer producer) {
        System.out.println("Ordering: " + product.getQuantityOfProduct() + "x " + product.getNameOfProduct() +
                " from: " + producer.getProducerName() + "\nThe time of order is: " + productOrderedTime.toString());
        return true;
    }
}
