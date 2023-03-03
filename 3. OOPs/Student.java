public class Student {
    private int rollNumber;
    private String name;
    private String course;
    private float marks1;
    private float marks2;
    private float marks3;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getMarks1() {
        return marks1;
    }

    public void setMarks1(float marks1) {
        this.marks1 = marks1;
    }

    public float getMarks2() {
        return marks2;
    }

    public void setMarks2(float marks2) {
        this.marks2 = marks2;
    }

    public float getMarks3() {
        return marks3;
    }

    public void setMarks3(float marks3) {
        this.marks3 = marks3;
    }

    public float calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    public float calculateAverage() {
        return calculateTotal() / 3;
    }

    public String calculateGrade() {
        float average = calculateAverage();

        if (average >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + "\n"
                + "Name: " + name + "\n"
                + "Course: " + course + "\n"
                + "Marks 1: " + marks1 + "\n"
                + "Marks 2: " + marks2 + "\n"
                + "Marks 3: " + marks3 + "\n"
                + "Total Marks: " + calculateTotal() + "\n"
                + "Average Marks: " + calculateAverage() + "\n"
                + "Grade: " + calculateGrade();
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setRollNumber(1);
        student1.setName("Siddharth");
        student1.setCourse("Java Programming");
        student1.setMarks1(85.0f);
        student1.setMarks2(90.0f);
        student1.setMarks3(95.0f);

        Student student2 = new Student();
        student2.setRollNumber(2);
        student2.setName("Rahul");
        student2.setCourse("Python Programming");
        student2.setMarks1(75.0f);
        student2.setMarks2(80.0f);
        student2.setMarks3(85.0f);

        Student student3 = new Student();
        student3.setRollNumber(3);
        student3.setName("Neha");
        student3.setCourse("C Programming");
        student3.setMarks1(65.0f);
        student3.setMarks2(70.0f);
        student3.setMarks3(75.0f);

        Student student4 = new Student();
        student4.setRollNumber(4);
        student4.setName("Amit");
        student4.setCourse("JavaScript Programming");
        student4.setMarks1(55.0f);
        student4.setMarks2(30.0f);
        student4.setMarks3(35.0f);

        Student student5 = new Student();
        student5.setRollNumber(5);
        student5.setName("Raj");
        student5.setCourse("C++ Programming");
        student5.setMarks1(80.0f);
        student5.setMarks2(90.0f);
        student5.setMarks3(65.0f);

        System.out.println(student1.getName() + ": " + student1.calculateGrade());
        System.out.println(student2.getName() + ": " + student2.calculateGrade());
        System.out.println(student3.getName() + ": " + student3.calculateGrade());
        System.out.println(student4.getName() + ": " + student4.calculateGrade());
        System.out.println(student5.getName() + ": " + student5.calculateGrade());
    }   
}