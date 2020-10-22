package People;

public class Patient extends Person{

    public Patient(String name){
        super(name);
    }

    public void contact(String msg){
        // Concrete Patient specific implementation of contact
        // Overrides the abstract method in Person
        System.out.println("Bed Phone "+name+" on "+contactNum+":"+msg);
    }
}
