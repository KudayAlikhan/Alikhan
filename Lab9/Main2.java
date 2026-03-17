class Student {
    String name;
    static String university = "KazNU";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies at " + university);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ali");
        Student s2 = new Student("Aruzhan");

        s1.display();
        s2.display();
    }
}
