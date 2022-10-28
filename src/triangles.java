public class triangles {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(3, 2.5, 3, 3, 3);
        Triangle triangleB = new Triangle(1,1,1,1,1);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);
        System.out.println(Triangle.numOfSides);
    }
}