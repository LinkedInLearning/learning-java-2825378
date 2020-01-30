public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName,
                          String declaredMajor, double gpa, int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
