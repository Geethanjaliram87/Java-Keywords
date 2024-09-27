package JavaKeywords;
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void printName() {
    	System.out.println("To Print the Name using this Keyword: " );
        System.out.println("Name: " + this.name);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Student s = new Student("R.Geethanjali");
        s.printName();
    }
}
