package Entities;
// An abstract class containing common code for members of the hospital database
// It doesn't have an implementation of the contact method in the Contactable interface
// so must be abstract - its subclasses therefore must implement the contact method
public abstract class Person implements Contactable {
    protected String name;
    protected String contactNum;

    public Person(String name){
        this.name=name;
    }

    // This could be phone, pager, bed phone etc
    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }


}
