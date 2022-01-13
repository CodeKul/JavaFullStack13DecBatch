package interfacedemo;

/**Cloneable interface Example
 *  - belongs to java.lang package
 *  - generates replica(copy) of an object
 */
public class Product implements Cloneable{
    int pid;
    String productName;
    double price;

    public Product(int pid, String productName, double price) {
        this.pid = pid;
        this.productName = productName;
        this.price = price;
    }

    void displayInfo(){
        System.out.println("Product Id: "+pid);
        System.out.println("Product Name: "+productName);
        System.out.println("Product Price: "+price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class ProductImpl{
    public static void main(String[] args) throws CloneNotSupportedException{
        Product product = new Product(125,"Tata Car",150000);
        Product product1 = (Product) product.clone();
        product1.displayInfo();
    }
}