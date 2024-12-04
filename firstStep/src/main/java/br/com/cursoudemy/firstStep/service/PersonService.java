package br.com.cursoudemy.firstStep.service;

import br.com.cursoudemy.firstStep.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong atomicLong = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll(){
        logger.info("finding all");
        List<Person> persons =  new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPeson(i);
            persons.add(person);
        }

        return persons;
    }


    public Person findById(String id){
        logger.info("finding one person");

        Person person = new Person();
        person.setId(atomicLong.incrementAndGet());
        person.setAddress("address");
        person.setFirstName("Pedro");
        person.setLastName("Costa");
        person.setGender("M");
        return person;
    }

    public Person create(Person person){
        logger.info("creating person");
        return person;
    }

    public Person update(Person person){
        logger.info("updating person");
        return person;
    }


    public void delete(String id) {
        logger.info("Delete Person");
    }

    public Person mockPeson(int i) {
        Person person = new Person();
        person.setId(atomicLong.incrementAndGet());
        person.setFirstName("First name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("address " + i);
        person.setGender("M");
        return person;
    }
}
