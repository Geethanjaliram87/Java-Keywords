package JavaKeywords;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

interface Workable {
    void work();
}

class Employee extends Person implements Workable {
    Employee(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is working");
    }
}

public class ExtendsImplementsExample {
    public static void main(String[] args) {
        Employee emp = new Employee("R.Geethanjali");
        emp.display();
        emp.work();
    }
}

