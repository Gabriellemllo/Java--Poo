package com.aula.poo.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.poo.demo.models.Person;
import com.aula.poo.demo.repositories.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    // o @Autowired é uma anotação do Spring que indica que a dependência deve ser injetada automaticamente
    // o @Service é uma anotação do Spring que indica que a classe é um serviço
    public void insertPerson(Person person) {
      if(person.getAge() < 18){
        throw new RuntimeException("Invalid age");
      }
        personRepository.save(person);

    }
    
    // pedir para o chatgpt me explicar isso aí, não entendi e vou precisar estudar .
    // estudar o optional
    public Person findPersonById(Long id) {
        Optional<Person> personOptional = personRepository.findById(id);

        if(personOptional.isPresent()){
            return personOptional.get();
        }
        else{
            throw new RuntimeException("Person not found");
        }
    }
        public List<Person> findAllPeople(){
            return personRepository.findAll();
        }

        public void deletePerson(Long id) {
            Person person;

            try{
                person = findPersonById(id);
            } catch (RuntimeException rt) {
                throw new RuntimeException("Person not found");
            }

            personRepository.delete(person);

    }

    public void updatePerson(Long id, String newName) {
       Person person;
       try{
        person = findPersonById(id);
       } catch (RuntimeException rt) {
        throw new RuntimeException("Person not found");
       }
        person.setName(newName);
        personRepository.save(person);
    }
}
