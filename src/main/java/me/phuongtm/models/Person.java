package me.phuongtm.models;

/**
 * Created by phuongtm on 3/19/2017.
 */
public class Person {

    private String firstName; // This is mandatory field
    private String lastName; // This is mandatory field
    private String address;
    private String description;
    private int age;

    private Person(String firstName, String lastName, String address, String description, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.description = description;
        this.age = age;
    }

    public static FirstName builder() {
        return new Builder();
    }

    public interface Buildable {
        Buildable withAddress(final String address);

        Buildable withDescription(final String description);

        Buildable withAge(final int age);

        Person build();
    }

    public interface FirstName {
        LastName withFirstName(final String firstName);
    }

    public interface LastName {
        Buildable withLastName(final String lastName);
    }

    private static class Builder implements FirstName, LastName, Buildable {

        private String firstName;
        private String lastName;
        private String address;
        private String description;
        private int age;

        public Builder withAddress(final String address) {
            this.address = address;
            return this;
        }

        public Builder withDescription(final String description) {
            this.description = description;
            return this;
        }

        public Builder withAge(final int age) {
            this.age = age;
            return this;
        }

        public LastName withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Buildable withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, address, description, age);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                '}';
    }

}
