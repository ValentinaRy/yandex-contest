import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    private static class Person {
        final String name;
        final String lastName;
        final int age;

        private Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        TreeMap<String, Person> people = new TreeMap<>();
        Person alice = new Person("Alice", "123", 22);
        Person bob = new Person("Bob", "456", 21);
        Person carol = new Person("Carol", "789", 15);
        people.put(bob.name, bob);
        people.put(carol.name, carol);
        people.put(alice.name, alice);
        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
