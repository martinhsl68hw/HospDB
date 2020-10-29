package Entities;

public class Scanner implements Contactable, Trackable{
    // Scanner class - currently only implements the Contactable an Trackable interfaces
    @Override
    public void contact(String msg) {
        System.out.println("Scanner logging "+msg);
    }

    @Override
    public String whereAmI() {
        return "Scanner Location";
    }
}
