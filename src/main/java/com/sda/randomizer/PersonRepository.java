package com.sda.randomizer;

import java.util.List;

public class PersonRepository {
    public List<Person> removePerson(List<Person> people, Person person) {
        people.remove(person);
        return people;
    }

    public List<Person> updatePerson(List<Person> people, Person person, String name, int difficulty) {
        int personToUpdatepeople = people.indexOf(person);
        person.setName(name);
        person.setDifficulty(difficulty);
        people.set(personToUpdatepeople, person);
        return people;
    }
}
