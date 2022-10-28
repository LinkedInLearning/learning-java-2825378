public class StudentProfile {
   
   String firstName;
   String lastName;
   int expectedGradYear;
   double GPA;
   String major;
   
   public StudentProfile(String firstName, String lastName, 
                        int expectedGradYear,double GPA,
                        String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGradYear = expectedGradYear;
        this.GPA = GPA;
        this.major = major;
                        }
   
    public int delayGraduation(int delayby) {
        expectedGradYear = expectedGradYear + delayby;
        return expectedGradYear;
    }                    
}
