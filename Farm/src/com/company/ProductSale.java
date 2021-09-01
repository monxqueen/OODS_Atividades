package com.company;

public class ProductSale {
    private Product product;
    private float value;
    private float discount;

    public ProductSale(Product product, float discount) {
        this.product = product;

        if (discount > product.getDiscount_max()) {
            this.discount = product.getDiscount_max();
        } else if(discount < 0) {
            this.discount = 0;
        } else {
            this.discount = discount;
        }

        if(this.discount > 0) {
            this.value = product.getPrice() - (product.getPrice() * this.discount / 100);
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getDiscount() {
        return discount;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setDiscount(float discount) {
        if (discount > product.getDiscount_max()) {
            this.discount = product.getDiscount_max();
        } else if(discount < 0) {
            this.discount = 0;
        } else {
            this.discount = discount;
        }
    }
}
