package org.kahnsoft.restServiceDemo.com.persons;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CreatePerson {

    @PersistenceContext
    private EntityManager entityManager;

    public String CreateUser(String firstName, String lastName, String city) {
        Person person = new Person();
        person.setFirstname(firstName);
        person.setLastname(lastName);
        person.setCity(city);

        entityManager.persist(person);

        return person.toString();
    }

}
