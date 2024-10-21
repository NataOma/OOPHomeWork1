package HomeWork1;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с генеалогическим древом
public class FamilyTree {
    private List<Person> people;

    // конструктор
    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    // метод добавления человека
    public void addPerson(Person person) {
        this.people.add(person);
    }

    // метод вывода списка детей
    public List<Person> getChildren(Person parent) {
        return parent.getChildren();
    }
    // метод находит человека по имени
    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

}
