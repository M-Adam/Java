package studentproject;

public class StudentProject {

    public static void main(String[] args) {
        Student s1 = new Student("Adam", 4, 4.5, 5);
        Student s2 = new Student("Jarek");
        Student s3 = new Student("Marek", 2, 3);
        
        s1.getStudentInfo();
        s2.getStudentInfo();
        s3.getStudentInfo();
    }
}