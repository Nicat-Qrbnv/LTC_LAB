package lesson16.normal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Participant {
    private final String name, email;
    private final int age;
    static File participants = new File("participants.txt");

    public Participant(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("""
                |%-20s|
                | %-9s (age: %-2d)|
                | %-19s|
                |%-20s|
                """, "Participant:", name, age, email, "_".repeat(20));
    }

    public static void displayParticipants () {

        String contents = "";

        try {
            contents = Files.readString(participants.toPath());
        } catch (IOException e) {
            System.out.println (e.getMessage());
        }
        System.out.println (contents);

    }

    public static Participant newParticipant (String name, String email, int age) throws ParticipantExistsException{

        Participant p = new Participant(name, email, age);
        String contents = "";

        try {
            contents = Files.readString(participants.toPath());
        } catch (IOException e) {
            System.out.println (e.getMessage());
        }

        if (!contents.contains(p.toString())) {

            try {
                FileWriter myWriter = new FileWriter("participants.txt", true);
                myWriter.write(p.toString());
                myWriter.close();
            } catch (IOException e) {
                System.out.println (e.getMessage());
            }

        } else {
            throw new ParticipantExistsException("This participant exists!");
        }

        return p;
    }

}
