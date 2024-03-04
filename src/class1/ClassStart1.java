package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "김지유";
        student1.age = 24;
        student1.grade = 80;

        Student student2;
        student2 = new Student();
        student2.name = "토토";
        student2.age = 2;
        student2.grade = 10;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
