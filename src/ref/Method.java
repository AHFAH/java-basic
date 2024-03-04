package ref;

public class Method {

    public static void main(String[] args) {
        Student student1 = createStudent("지유", 24, 100);
        Student student2 = createStudent("토토", 2, 0);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student std = new Student();
        std.name = name;
        std.age = age;
        std.grade = grade;
        return std;
    }

    static void printStudent(Student std){
        System.out.println("이름: " + std.name + " 나이: " + std.age + " 성적: " + std.grade);
    }
}
