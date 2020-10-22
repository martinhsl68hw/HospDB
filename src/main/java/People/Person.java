package People;
// An abstract class containing common code for members of the hospital database
// and an abstract method contact
// If a class contains an abstract method that should be overridden by a sub class,
// then the class itself becomes abstract and can't be instantiated itself, only its subclasses
public abstract class Person {
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

    // To be overridden in the subclass with a specific implementation of how to contact a member
    // of the hospital database
    public abstract void contact(String msg);
}
