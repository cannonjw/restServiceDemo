package org.kahnsoft.restServiceDemo;

import org.kahnsoft.restServiceDemo.com.persons.CreatePerson;
import org.kahnsoft.restServiceDemo.com.persons.GetPerson;
import org.kahnsoft.restServiceDemo.com.persons.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
public class HelloWorldController {

    @Autowired
    private CreatePerson createPerson;
    @Autowired
    private GetPerson getPerson;

    @RequestMapping(method = RequestMethod.POST, path = "/createPerson")
    public String helloWorld(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname, @PathParam("city") String city) {
        return createPerson.CreateUser(firstname, lastname, city);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/findPerson")
    public Optional<Person> findPerson(@PathParam("ID") Integer uid) {
        return getPerson.findById(uid);
    }
}
