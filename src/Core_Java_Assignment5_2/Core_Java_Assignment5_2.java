package Core_Java_Assignment5_2;

public class Core_Java_Assignment5_2 {
    public static void main(String[] args) {

        // Rectangle details
        double width = 10, length = 12;
        Figure rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.findArea()
                + "\nResulting perimeter: " + rectangle.findPerimeter() + "\n");

       // Circle details
        double radius = 8;
        Figure circle = new CIrcle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.findArea()
            + "\nResulting Perimeter: " + circle.findPerimeter() + "\n"); 

        // Triangle details
        double a = 6, b = 8, c = 10;
        Figure triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.findArea()
                + "\nResulting Perimeter: " + triangle.findPerimeter() + "\n");
    }
}