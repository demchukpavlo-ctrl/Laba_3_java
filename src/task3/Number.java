package task3;

/**
 * Інтерфейс "Число" (замість абстрактного класу із Завдання 2).
 * Інтерфейс не може мати полів екземпляра, тому поле typeName
 * замінене методом getTypeName(), який реалізує кожен клас.
 */
public interface Number {

    /** Назва типу числа. */
    String getTypeName();

    /** Значення числа у вигляді double (для змішаних операцій). */
    double toDouble();

    /** Додавання. */
    Number add(Number other);

    /** Віднімання. */
    Number subtract(Number other);

    /** Множення. */
    Number multiply(Number other);

    /** Ділення. */
    Number divide(Number other);
}
