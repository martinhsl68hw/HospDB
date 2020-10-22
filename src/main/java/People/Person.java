package People;

public abstract class Person {
    protected String name;

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    protected String contactNum;

    public Person(String name){
        this.name=name;
    }

    public abstract void contact(String msg);
}
