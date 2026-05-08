package lab11;
	public class Sector implements Shape {
	    private double radius, angle;

	    public Sector(double radius, double angle) {
	        this.radius = radius;
	        this.angle = angle;
	    }

	    @Override
	    public double area() {
	        return (angle / 360) * Math.PI * radius * radius;
	    }

	    @Override
	    public void display() {
	        System.out.println("Sector area: " + area());
	    }
	}
