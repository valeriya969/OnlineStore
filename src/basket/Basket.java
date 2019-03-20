package basket;

import product.Product;

import java.util.Arrays;

public class Basket {
    private Product[] products = new Product[100];

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i]==null) {
                products[i] = product;
            }
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
