package lab11;
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Square(4),
            new Rectangle(4, 5),
            new Triangle(3, 6),
            new Trapezoid(3, 5, 4),
            new Circle(3),
            new Sector(3, 90),
            new Ellipse(4, 2),
            new Parallelogram(5, 3)
        };

        for (Shape s : shapes) {
            s.display();
        }
    }
}