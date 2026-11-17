package task3;

/**
 * Дійсне число, що реалізує інтерфейс Number. Результат будь-якої операції —
 * Real.
 */
public class Real implements Number {
    private static final double EPS = 1e-9;
    private final double value;

    public Real(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String getTypeName() {
        return "Real";
    }

    @Override
    public double toDouble() {
        return value;
    }

    @Override
    public Number add(Number other) {
        return new Real(value + other.toDouble());
    }

    @Override
    public Number subtract(Number other) {
        return new Real(value - other.toDouble());
    }

    @Override
    public Number multiply(Number other) {
        return new Real(value * other.toDouble());
    }

    @Override
    public Number divide(Number other) {
        double d = other.toDouble();
        if (Math.abs(d) < EPS) {
            throw new ArithmeticException("Ділення на нуль");
        }
        return new Real(value / d);
    }

    @Override
    public String toString() {
        return "Real(" + value + ")";
    }

    /** Дійсні числа порівнюються з точністю EPS. */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Real))
            return false;
        return Math.abs(value - ((Real) obj).value) < EPS;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(Math.round(value * 1e6) / 1e6);
    }
}
