package lab11;
	public class Square implements Shape {
	    private double side;

	    public Square(double side) {
	        this.side = side;
	    }

	    @Override
	    public double area() {
	        return side * side;
	    }

	    @Override
	    public void display() {
	        System.out.println("Square area: " + area());
	    }
	}

