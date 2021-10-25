public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double GPA;
    int expectedGraduationYear;

    public StudentProfile(String firstName, String lastName, String declaredMajor,
                          double GPA, int expectedGraduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.GPA = GPA;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public void updateExpectedGraduationYear() {
        this.expectedGraduationYear += 1;
    }

    public void updateGPA(double newGPA) {
        this.GPA = newGPA;
    }
}
