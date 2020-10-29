import Entities.Contactable;
import Entities.Doctor;
import Entities.Scanner;
import Entities.Trackable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a Hospital database object and add some people
        HospDB db=new HospDB();
        db.addDoctor("Dr Martin Holloway", "012366");
        db.addDoctor("Dr John Smith", "012366");
        db.addDoctor("Dr Bill Gates", "012366");
        db.addPatient("Mr Jim Browning", "88787");

        // Pass them all some messages
        db.contactAll("Clear the hospital! Emergency!");
        db.contactAll("That was just a test!");

        // Create a Doctor
        Doctor doc=new Doctor("Dr Geoff Hans");
        doc.setContactNum("889902288");

        // Create a scanner
        Scanner scan=new Scanner();

        // Polymorphism!
        // See each object from the perspective of the Contactable interface
        // This effectively casts each object to be a Contactable
        ArrayList<Contactable> contacts=new ArrayList<Contactable>();
        contacts.add(doc);
        contacts.add(scan);
        // This loops through the 'contacts' ArrayList, setting the local variable c to be the
        // next object in the ArrayList as it iterates
        for (Contactable c:contacts)
            c.contact("Hello");

        // See each object from the perspective of the Trackable interface
        // This effectively casts each object to be a Trackable
        ArrayList<Trackable> tracks=new ArrayList<Trackable>();
        tracks.add(doc);
        tracks.add(scan);
        // This loops through the 'tracks' ArrayList, setting the local variable t to be the
        // next object in the ArrayList as it iterates
        for (Trackable t:tracks)
            System.out.println(t.whereAmI());

    }
}
