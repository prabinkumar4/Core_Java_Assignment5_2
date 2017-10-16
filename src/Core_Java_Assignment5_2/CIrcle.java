package Core_Java_Assignment5_2;

public class CIrcle extends Figure {
    private final double radius;
    

    public CIrcle() {
        this(1);
    }   
    public CIrcle(double radius) {
        this.radius = radius;
    }

  
    public double findArea() {
        
        return 3.14 * Math.pow(radius, 2);
    }

    public double findPerimeter() {
        
        return 2 * 3.14 * radius;
    }
}
