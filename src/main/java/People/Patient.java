package People;

public class Patient extends Person{

    public Patient(String name){
        super(name);
    }

    public void contact(String msg){
        System.out.println("Bed Phone "+name+" on "+contactNum+":"+msg);
    }
}
