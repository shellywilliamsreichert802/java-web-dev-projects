import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Course {
    private String courseName;
    private int courseId;
    private Map<Integer, Student> enrolledStudents; // Using a HashMap for student enrollment
//use ArrayList in lieu of HashMap
//    private ArrayList<Student> enrolledStudents;

    //fields for courseName and courseId
    public Course(String courseName, int courseId) { // Constructor
        this.courseName = courseName;
        this.courseId = courseId;
        //use a HashMap<Integer, Student> to keep track of enrolled students (using student IDs as keys)
        //The enrollStudent method adds a student to the course.
        this.enrolledStudents = new HashMap<>();
//      this.enrolledStudents = new ArrayList<>();
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter for courseId
    public int getCourseId() {
        return courseId;
    }

    // Setter for courseId
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    // Add a student to the course
    public void enrollStudent(Student student) {
        enrolledStudents.put(student.getStudentId(), student);
    }

    // Get enrolled students: The getEnrolledStudents method returns a list of enrolled students.
    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents.values());
    }

    // Remove a student from the course: The removeStudent method removes a student from the course based on their ID.
    public void removeStudent(int studentId) {
        enrolledStudents.remove(studentId);
    }

    // Other methods specific to the Course class can be added here
}
//package exercises.classespart1;
//
//import exercises.classespart2.Teacher;
//
//import java.util.ArrayList;
//
//public class Course {
//        private String topic;
//        private Teacher instructor;
//        private ArrayList<Student> enrolledStudents;
//    }
//}
