package a1.lesson12.moderate;

public class Main {
    public static void main(String[] args) {

        Book theLastWish = new Book("The Last Wish", "Sapkowski", 1, 1993);
        Book swordOfDestiny = new Book("Sword of Destiny", "Sapkowski", 2, 1992);
        Book bloodOfElves = new Book("Blood of Elves", "Sapkowski", 3, 1994);
        Book timeOfContempt = new Book ("Time of Contempt", "Sapkowski", 4, 1995);

        Library brdt = new Library("Biblioteca Reale di Torino");
        brdt.addBook(theLastWish);
        brdt.addBook(swordOfDestiny);
        brdt.addBook(bloodOfElves);
        brdt.addBook(timeOfContempt);
        System.out.println (brdt);

        Member mem1 = new Member("Nicat", 1);
        mem1.borrowBook(brdt, theLastWish);
        System.out.println (mem1);

    }
}
