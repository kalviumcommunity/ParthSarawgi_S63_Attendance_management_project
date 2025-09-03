package src.com.school;

public class Main {
    public static void main(String[] args) {
        // Create array of Students
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails(1, "Alice");
        students[1] = new Student();
        students[1].setDetails(2, "Bob");

        // Create array of Courses
        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setDetails(101, "Mathematics");
        courses[1] = new Course();
        courses[1].setDetails(102, "Computer Science");

        // Display Students
        System.out.println("=== Student Details ===");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display Courses
        System.out.println("\n=== Course Details ===");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
