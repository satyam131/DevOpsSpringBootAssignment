package com.devops.devopsproject.services;

import com.devops.devopsproject.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;


    private PersonService personService;

    @BeforeEach
    void setUp() {
        this.personService = new PersonService(this.personRepo);
    }

    @Test
    void getAllPerson() {
        personService.getAllPerson();
        verify(personRepo).findAll();
    }
}
