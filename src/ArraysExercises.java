import java.util.Arrays;

public class ArraysExercises {

        static Person[] people = new Person[4];

    public static void main(String[] args) {
        addPerson();
        people[0] = new Person("Jason");
        people[1] = new Person("Jason Jr");
        people[2] = new Person("Jenevieve");

        for (Person person : people) {
            System.out.println(person.getName());

        }
    }
    static void addPerson() {
        Person[] addPerson = Arrays.copyOf(people, people.length + 1);
        people[3] = new Person("Bob");
    }
}
