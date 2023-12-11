package a1.lesson13.task1;

public class Main {

    public static void main(String[] args) {
        Vehicle vcl1 = new Vehicle("Brand1", "Model1", 2001);
        Vehicle vcl2 = new Vehicle("Brand2", "model2", 2002);

        Car car1 = new Car("Brand3", "Model3", 3,2003);
        Car car2 = new Car("Brand4", "Model4", 5, 2004);

        Bike bk1 = new Bike("Brand5", "Model5", 2, 2005);
        Bike bk2 = new Bike("Brand6", "Model6", 3, 2006);

        System.out.println(vcl1);
        System.out.println(vcl2);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(bk1);
        System.out.println(bk2);
    }
}
