package zad2;

public class Student implements Comparable<Student>{
    private String name;
    private double grade1, grade2, grade3;
    private int studentId;
    private static int studentCount = 0;
    
    public Student(String name){
        this.name = name;
        this.studentId = Student.studentCount;
        Student.studentCount++;
    }
    
    public Student(String name, double grade1){
        this.name = name;
        this.grade1 = grade1;
        this.studentId = Student.studentCount;
        Student.studentCount++;
    }
    
    public Student(String name, double grade1, double grade2){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.studentId = Student.studentCount;
        Student.studentCount++;
    }
    
    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.studentId = Student.studentCount;
        Student.studentCount++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setGrade(int gradeNumber, double grade){
        switch (gradeNumber){
            case 1:
                this.grade1 = grade;
                break;
            case 2: 
                this.grade2 = grade;
                break;
            case 3:
                this.grade3 = grade;
                break;
            default:
                System.out.println("gradeNumber argument should be [1-3]");
                break;
        }
    }
    
    public double getAvg(){
        return ((this.grade1+this.grade2+this.grade3)/3);
    }
    
    public void getStudentInfo(){
        System.out.println("Student "+this.name+":\nGrades: "+this.grade1+"; "+this.grade2+"; "+this.grade3+"\nAvarage: "+this.getAvg());
    }

    @Override
    public int compareTo(Student o) {
        if(this.getAvg() > o.getAvg()) return -1;
        else if (this.getAvg() < o.getAvg()) return 1;
        else return 0;
    }
    
    @Override
    public String toString(){
        return this.studentId+" "+this.name +" "+this.getAvg();
    }
}