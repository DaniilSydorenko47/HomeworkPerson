import java.util.Objects;

public class Person {
    int yearOfBirth;
    String name;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                '}';
    }
}
