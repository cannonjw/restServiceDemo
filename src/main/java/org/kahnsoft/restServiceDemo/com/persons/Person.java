package org.kahnsoft.restServiceDemo.com.persons;

import javax.persistence.*;

@Entity
@Table(name="Persons")

public class Person {

    protected Person() {

    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name="PersonID")
    private Integer PersonID;
    public Integer getPersonID() {
        return PersonID;
    }
    public void setPersonID(Integer personID) {
        PersonID = personID;
    }

    @Column(name="Firstname")
    private String Firstname;
    public String getFirstname() {
        return Firstname;
    }
    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    @Column(name="Lastname")
    private String Lastname;
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    @Column(name="City")
    private String City;
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonID=" + PersonID +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

}
