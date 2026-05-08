package lab11;
	public class Ellipse implements Shape {
	    private double a, b;

	    public Ellipse(double a, double b) {
	        this.a = a;
	        this.b = b;
	    }

	    @Override
	    public double area() {
	        return Math.PI * a * b;
	    }

	    @Override
	    public void display() {
	        System.out.println("Ellipse area: " + area());
	    }
	}

