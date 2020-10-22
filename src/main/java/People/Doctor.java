package People;

public class Doctor extends Person{

    public Doctor(String name){
        super(name);
    }

    public void contact(String msg){
        System.out.println("Page "+name+" on "+contactNum+":"+msg);
    }

}
