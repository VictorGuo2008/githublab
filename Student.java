public class Student {
    String name;

    public Student(String n) {
        name = n;
    }

    public void printStudent() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student b = new Student("John Doe");
        b.printStudent();
    }
}