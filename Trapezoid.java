package lab11;
	public class Trapezoid implements Shape {
	    private double a, b, height;

	    public Trapezoid(double a, double b, double height) {
	        this.a = a;
	        this.b = b;
	        this.height = height;
	    }

	    @Override
	    public double area() {
	        return ((a + b) / 2) * height;
	    }

	    @Override
	    public void display() {
	        System.out.println("Trapezoid area: " + area());
	    }
	}
