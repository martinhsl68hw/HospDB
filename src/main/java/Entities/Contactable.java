package Entities;

public interface Contactable {
    // To be overridden in the subclass with a specific implementation of how to contact a member
    // of the hospital database
    void contact(String msg);
}
