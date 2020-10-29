package Entities;

public class Patient extends Person implements Trackable{

    public Patient(String name){
        super(name);
    }

    public void contact(String msg){
        // Concrete Patient specific implementation of contact
        // Overrides the abstract method in Person
        System.out.println("Bed Phone "+name+" on "+contactNum+":"+msg);
    }

    @Override
    // Implements the Trackable interface
    public String whereAmI() {
        return "Patient's bed number";
    }
}
