package lab11;
	public class Parallelogram implements Shape {
	    private double base, height;

	    public Parallelogram(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    @Override
	    public double area() {
	        return base * height;
	    }

	    @Override
	    public void display() {
	        System.out.println("Parallelogram area: " + area());
	    }
	}
