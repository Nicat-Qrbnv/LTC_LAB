package lesson27.task2;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Product p1 =  new Product(1,5, "apple", 1.0);
        Product p2 =  new Product(2,3, "orange", 2.0);
        Product p3 =  new Product(3,10, "cherry", 3.0);
        Product p4 = new Product(4, 7, "plum", 5.0);
        Product pn1 = new Product(1,1, "apple", 1.5);

        System.out.println (p1);
        System.out.println (pn1);
        System.out.println ();

        ProductCatalog pc1 = new ProductCatalog();

        pc1.addAllProducts(p1, p2, p3, p4);
        pc1.addProduct(pn1);
        System.out.println ();

        pc1.updateProduct(1, "green apple", 1.5, 7);
        System.out.println (pc1);
        System.out.println ();

        pc1.removeProduct(p4);
        System.out.println (pc1);
    }
}
