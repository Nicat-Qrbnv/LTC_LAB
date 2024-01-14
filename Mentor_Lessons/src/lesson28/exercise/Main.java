package lesson28.exercise;

public class Main {
    public static void main(String[] args) {

        PhoneDirectory pd = new PhoneDirectory();

        pd.addContact("Sarah", 772345678L);
        pd.addContact("Alice", 771234568L);
        pd.addContact("Bob"  , 771234569L);
        pd.addContact("Eva"  , 771234570L);
        pd.addContact("Michael", 771234571L);

        System.out.println (pd);

        pd.removeContact("Eva");
        System.out.println ();

        System.out.println (pd);
    }
}
