package OptionalExcercise.JavaKeywords;
import java.io.*;

class Person implements Serializable {
    String name;
    transient int age;  // This field will not be serialized

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TransientExample {
    public static void main(String[] args) {
        Person person = new Person("R.Geethanjali", 30);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {

            // Serialize the object
            out.writeObject(person);

            // Deserialize the object
            Person deserializedPerson = (Person) in.readObject();

            // The transient age field will not be serialized
            System.out.println("Transient Example: "); // Output: John

            System.out.println("Name: " + deserializedPerson.name); // Output: John
            System.out.println("Age: " + deserializedPerson.age);   // Output: 0 (default value for int)

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
