package inheritance;

public class UniversityModel {
    public static void main(String[] args) {
        Student student = new Student();
        student.showStudentInfo();

        Course course = new Course();
        course.showCourseInfo();
    }
}

class University {
    String studentName = "Anna Peters";
    int studentId = 1;
    String studentDepartment = "Social Science";
    String courseName = "The Ancient World: Rome";
    int courseId = 1403;
}

class Student extends University {
    public void showStudentInfo() {
        System.out.printf("Student name: %s, id: %d, department: %s\n",
                studentName, studentId, studentDepartment);
    }
}

class Course extends University {
    public void showCourseInfo() {
        System.out.printf("Course name: %s, id: %d\n", courseName, courseId);
    }
}
