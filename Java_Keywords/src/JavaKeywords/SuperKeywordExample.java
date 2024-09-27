package JavaKeywords;
class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calling parent constructor
        System.out.println("Child constructor called");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        new Child();
    }
}

