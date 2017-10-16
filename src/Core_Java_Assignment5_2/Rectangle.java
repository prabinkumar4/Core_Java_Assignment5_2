package Core_Java_Assignment5_2;


public class Rectangle extends Figure {
    private final double width, length; 

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    
    public double findArea() {
        // A = w * l
        return width * length;
    }

 
    public double findPerimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }

}