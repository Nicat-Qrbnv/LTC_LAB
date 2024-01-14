package lesson27.task2;

import java.util.LinkedHashSet;

class ProductCatalog {

    //fields
    private final LinkedHashSet <Product> products = new LinkedHashSet<>();

    //constructor
    public ProductCatalog() {
    }

    //methods
    public void addProduct (Product p) {
        boolean added = products.add(p);
        System.out.println ( p.getName() + (added ? " is added!" : " exists!") );
    }

    public void addAllProducts (Product... ps) {
        for (Product p : ps) {
            boolean added = products.add(p);
            System.out.println(p.getName() + (added ? " is added!" : " exists!"));
        }
    }

    public void updateProduct (int id, String newName, double newPrice, int newQuantity) {

        for (Product p : products) {
            if (p.getID() == id) {
                p.setName(newName);
                p.setQuantity(newQuantity);
                p.setPrice(newPrice);
            }
        }

    }

    public void removeProduct (Product p) {
        boolean removed = products.remove(p);
        System.out.println ( p.getName() + (removed ? " is removed!" : " does not exist!") );
    }

    @Override
    public String toString() {
        final StringBuilder productList = new StringBuilder("ProductCatalog: \n");
        products.forEach(p -> productList.append(p.toString().indent(4)));
        return productList.toString();
    }
}
