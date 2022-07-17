package com.kodilla.good.patterns.Food2Door;

public class Product {

    private final String nameOfProduct;
    private final int quantityOfProduct;
    private final boolean isAvailable;

    public Product(String nameOfProduct, int quantityOfProduct, boolean isAvailable) {
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.isAvailable = isAvailable;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
