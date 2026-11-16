//== Step 1 Part
public class Student {

    private String name;
    private String studentId;
    private double grade;
//== step 2 Part
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }
//==Step 3 Part
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
//==Step 4 Part
    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + studentId + " | Grade: " + grade);
    }
//Step 5 Part
    public static void main(String[] args) {
        Student s1 = new Student("Juan Dela Cruz", "2026-001", 90.0);
        Student s2 = new Student("Maria Santos", "2026-002", 88.5);

        s1.setGrade(99.0); // you can change value here using the setter

        s1.displayInfo();
        s2.displayInfo();
    }
}


