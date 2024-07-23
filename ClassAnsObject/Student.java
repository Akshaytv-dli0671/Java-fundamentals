package ClassAnsObject;

public class Student {
    int studentId;
    String name;
    int age;
    char grade;

    public Student(int studentId, String name, int age, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public char getGrade() {
        return grade;
    }



    public void display(){
        System.out.println("------------------------");
        System.out.println("StudentId:"+getStudentId());
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Grade: "+getGrade());
        System.out.println("-------------------------\n");
    }
}
