public class Teacher {
    private String firstName; // Private field for first name
    private String lastName; // Private field for last name
    private String subject; // Private field for subject
    private int yearsTeaching; // Private field for years of teaching experience

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter for yearsTeaching
    public int getYearsTeaching() {
        return yearsTeaching;
    }

    // Setter for yearsTeaching
    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    // Other methods specific to the Teacher class can be added here
//     Example usage:
     public static void main(String[] args) {
         Teacher teacher = new Teacher();
         teacher.setFirstName("Phillip");
         teacher.setLastName("Hodges");
         teacher.setSubject("Java Web Development");
         teacher.setYearsTeaching(10);
         System.out.println("Teacher: " + teacher.getFirstName() + " " + teacher.getLastName());
         System.out.println("Subject: " + teacher.getSubject());
         System.out.println("Years of teaching experience: " + teacher.getYearsTeaching());
     }
}
