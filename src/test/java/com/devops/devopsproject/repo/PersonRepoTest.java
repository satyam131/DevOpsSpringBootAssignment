package com.devops.devopsproject.repo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.devops.devopsproject.entites.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExistsById(){
        Person person = new Person(123, "Satyam", "Gorakhpur");
        personRepo.save(person);
        Boolean actualResult = personRepo.isPersonExitsById(123);
        assertThat(actualResult).isTrue();
    }

    @AfterEach
    void tearDown(){
        System.out.println("tearing down");
        personRepo.deleteAll();
    }

    @BeforeEach
    void setUp(){
        System.out.println("Setting up");
    }
}
