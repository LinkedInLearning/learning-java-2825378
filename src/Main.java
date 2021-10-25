public class Main {

    public static void main(String[] args) {
        StudentProfile studentProfileA = new StudentProfile("Bonface", "Oywa",
                "Computer Science and Deep Learning", 3.9, 2021);
        StudentProfile studentProfileB = new StudentProfile("Edwinna", "Bikeri",
                "Computer Scince and Data Science", 3.8, 2022);

        System.out.println(studentProfileA.declaredMajor);
        studentProfileA.updateExpectedGraduationYear();
        System.out.println(studentProfileA.expectedGraduationYear);

        System.out.println(studentProfileB.declaredMajor);
        studentProfileB.updateGPA(3.9);
        System.out.println(studentProfileB.GPA);
    }

}
