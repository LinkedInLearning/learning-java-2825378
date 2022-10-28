public class StudentProfileCall {
   
    public static void main(String[] args) {
        StudentProfile Kenny_Hughes = new StudentProfile("Kenny", "Hughes", 2023, 3.5, "Computer_Science");
        StudentProfile JJ_Abrams = new StudentProfile("JJ", "Abrams", 2025, 3.95, "Film");
    
        //increment grad year
        JJ_Abrams.delayGraduation(2);

        System.out.println(JJ_Abrams.expectedGradYear);
    
    }

}
