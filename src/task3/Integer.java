package task3;

/**
 * Ціле число, що реалізує інтерфейс Number.
 * Операції з Integer дають Integer, операції з Real дають Real.
 */
public class Integer implements Number {
    private final long value;

    public Integer(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String getTypeName() {
        return "Integer";
    }

    @Override
    public double toDouble() {
        return value;
    }

    @Override
    public Number add(Number other) {
        if (other instanceof Integer) {
            return new Integer(value + ((Integer) other).value);
        }
        return new Real(value + other.toDouble());
    }

    @Override
    public Number subtract(Number other) {
        if (other instanceof Integer) {
            return new Integer(value - ((Integer) other).value);
        }
        return new Real(value - other.toDouble());
    }

    @Override
    public Number multiply(Number other) {
        if (other instanceof Integer) {
            return new Integer(value * ((Integer) other).value);
        }
        return new Real(value * other.toDouble());
    }

    /** Ділення цілих — цілочисельне; ділення на Real — дійсне. */
    @Override
    public Number divide(Number other) {
        if (other instanceof Integer) {
            long d = ((Integer) other).value;
            if (d == 0) {
                throw new ArithmeticException("Ділення на нуль");
            }
            return new Integer(value / d);
        }
        double d = other.toDouble();
        if (d == 0.0) {
            throw new ArithmeticException("Ділення на нуль");
        }
        return new Real(value / d);
    }

    @Override
    public String toString() {
        return "Integer(" + value + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Integer)) return false;
        return value == ((Integer) obj).value;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(value);
    }
}
