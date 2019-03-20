package category;

import product.Product;

import java.util.Arrays;
import java.util.Objects;

public class Category  {
    private String name;
    private String sex;
    private Product[] products;

    public Category(String name, String sex, Product[] products) {
        this.name = name;
        this.sex = sex;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(sex, category.sex) &&
                Arrays.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, sex);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}



