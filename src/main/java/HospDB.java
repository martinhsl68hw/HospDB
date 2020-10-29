import Entities.Doctor;
import Entities.Patient;
import Entities.Person;

import java.util.ArrayList;

public class HospDB {
    // A list of persons in the hospital database
    ArrayList<Person> persons=new ArrayList<Person>();

    public void addDoctor(String name, String pagerNum){
        // Create a Doctor object and add it to the ArrayList
        Doctor doc=new Doctor(name);
        doc.setContactNum(pagerNum);
        persons.add(doc);
    }
    public void addPatient(String name, String bedPhoneNum){
        // Create a Patient object and add it to the ArrayList
        Patient pat=new Patient(name);
        pat.setContactNum(bedPhoneNum);
        persons.add(pat);
    }
    public void contactAll(String msg){
        // A special for loop that iterates through each member of an ArrayList
        for (Person p:persons){
            // Call the abstract Person contact method, which then will call the appropriate concrete
            // contact method depending on whether it's a Doctor object or Patient object
            // ie polymorphism!
            p.contact(msg);
        }
    }

}
