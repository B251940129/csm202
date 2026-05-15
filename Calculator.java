package lab12;
public class Calculator {

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0-ээр хувааж болохгүй");
        }
        return a / b;
    }

    public double calculate(double a, double b, String op) {
        switch (op) {
            case "+": return add(a, b);
            case "-": return subtract(a, b);
            case "*": return multiply(a, b);
            case "/": return divide(a, b);
            default: throw new IllegalArgumentException("Буруу үйлдэл");
        }
    }
}