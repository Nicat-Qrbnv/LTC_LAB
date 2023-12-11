package lesson16.normal;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {


            Participant p3 = Participant.newParticipant("asdd", "ngr@mail.com", 20);

            Participant p1 = Participant.newParticipant("Nicat", "nct@mail.com", 26);
            Participant p2 = Participant.newParticipant("uuuyyy", "nht@mail.com", 18);
        } catch (ParticipantExistsException e) {
            System.out.println (e.getMessage());
        }
        Participant.displayParticipants();



    }
}
