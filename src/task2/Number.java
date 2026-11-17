package task2;

/**
 * Абстрактний базовий клас "Число" з абстрактними арифметичними операціями.
 */
public abstract class Number {
    private final String typeName; // назва типу числа (спільне поле для всіх нащадків)

    protected Number(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    /** Значення числа у вигляді double (для змішаних операцій). */
    public abstract double toDouble();

    /** Додавання. */
    public abstract Number add(Number other);

    /** Віднімання. */
    public abstract Number subtract(Number other);

    /** Множення. */
    public abstract Number multiply(Number other);

    /** Ділення. */
    public abstract Number divide(Number other);
}
