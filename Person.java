package HomeWork1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Класс, представляющий человека
public class Person extends FamilyTree {

    private String name;
    private LocalDate birthDate;
    private Person mother;
    private Person father;
    private List<Person> children;

    public Person(String name, LocalDate birthDate, List<Person> children) {
        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    public Person(String string, int i) {
        //TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
        }
}
    
