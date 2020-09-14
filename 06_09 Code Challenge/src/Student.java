public class Student {
    String firstName;
    String lastName;
    double GPA;
    int yrToGrad;
    String declaredMajor;

    public Student(String firstName,
            String lastName,
            double GPA,
            int yrToGrad,
            String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.yrToGrad = yrToGrad;
        this.declaredMajor = declaredMajor;
    }

    public void incrementYrToGrad(){
        this.yrToGrad= this.yrToGrad +1;
    }
}
