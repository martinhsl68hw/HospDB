import People.Doctor;
import People.Person;

public class Main {
    public static void main(String[] args) {
        HospDB db=new HospDB();
        db.addDoctor("Dr Martin Holloway", "012366");
        db.addDoctor("Dr John Smith", "012366");
        db.addDoctor("Dr Bill Gates", "012366");
        db.addPatient("Mr Jim Browning", "88787");
        db.contactAll("Clear the hospital! Emergency!");

        db.contactAll("That was just a test!");


    }
}
