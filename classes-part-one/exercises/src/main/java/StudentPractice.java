public class StudentPractice {
        //insantiate your Student class below
     public static void main(String[] args) {
//         Student student = new Student();
//         student.setName("Shelly Reichert");
//         student.setStudentId(12345);
//         student.setNumberOfCredits(1);
//         student.setGpa(4.0);
         Student student = new Student("Shelly Reichert", 12345, 1, 4.0);
//         Student student2 = new Student("Billy", )
//         student.setName('billy')
         System.out.println("Student name: " + student.getName());
         System.out.println("Student ID: " + student.getStudentId());
         System.out.println("Number of credits: " + student.getNumberOfCredits());
         System.out.println("GPA: " + student.getGpa());
     }

}
