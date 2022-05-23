package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product{
    private Integer productId;
    private String productName;
    private Double productPrice;

    public Product(Integer productId, String productName, Double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
    public Double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
public class StreamProductDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101,"HP Laptop",73000d));  //0
        products.add(new Product(102,"Dell Keyboard",71000d)); // 1
        products.add(new Product(103,"Nokia Phone",63000d)); //2
        products.add(new Product(104,"Apple iPhone",113000d)); //3
        products.add(new Product(105,"Lenovo Laptop",71000d));  //4
        //java 8
      List<Product> list =   products
                .stream()
                .filter(product -> product.getProductPrice() == 71000)
                .collect(Collectors.toList());
        System.out.println(list);

        Set<Product> set = products
                .stream()
                .filter(product -> product.getProductPrice() == 71000)
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
