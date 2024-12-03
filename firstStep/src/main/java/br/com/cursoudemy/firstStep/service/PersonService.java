package br.com.cursoudemy.firstStep.service;

import br.com.cursoudemy.firstStep.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong atomicLong = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

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
}
