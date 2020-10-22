import People.Doctor;
import People.Patient;
import People.Person;

import java.util.ArrayList;

public class HospDB {
    ArrayList<Person> persons=new ArrayList<Person>();

    public void addDoctor(String name, String pagerNum){
        Doctor doc=new Doctor(name);
        doc.setContactNum(pagerNum);
        persons.add(doc);
    }
    public void addPatient(String name, String bedPhoneNum){
        Patient pat=new Patient(name);
        pat.setContactNum(bedPhoneNum);
        persons.add(pat);
    }
    public void contactAll(String msg){
        for (Person p:persons){
            p.contact(msg);
        }
    }
}
