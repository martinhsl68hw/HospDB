package People;

public class Doctor extends Person{

    public Doctor(String name){
        // Call Person's constructor
        super(name);
    }

    public void contact(String msg){
        // Concrete Doctor specific implementation of contact
        // Overrides the abstract method in Person
        System.out.println("Page "+name+" on "+contactNum+":"+msg);
    }

}
