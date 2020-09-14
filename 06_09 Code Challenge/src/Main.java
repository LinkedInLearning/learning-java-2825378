public class Main {

    public static void main(String[] args){
        Student A = new Student("Andy","Smith",3.6,2022,"Computer Science");
        Student B = new Student("Eric","Homes",3.8,2024,"Math");

        System.out.println("Student A first name:" + A.firstName);
        System.out.println("Student A last name:" + A.lastName);
        System.out.println("Student A's major:" + A.declaredMajor);

        System.out.println("Student B first name:" + B.firstName);
        System.out.println("Student B graduate year:" + B.yrToGrad);

        System.out.println("Student B graduate year after change: " + B.incrementYrToGrad());
        //System.out.println();
        //System.out.println();
    }
}
