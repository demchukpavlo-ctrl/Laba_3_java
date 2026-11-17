package task3;

/**
 * Завдання 3, варіант 13 (Завдання 2 з інтерфейсом замість абстрактного класу).
 * Інтерфейс Number з операціями +, -, *, /; похідні класи Integer та Real.
 */
public class Main {

    private static void demo(Number a, Number b) {
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("  a + b = " + a.add(b));
        System.out.println("  a - b = " + a.subtract(b));
        System.out.println("  a * b = " + a.multiply(b));
        try {
            System.out.println("  a / b = " + a.divide(b));
        } catch (ArithmeticException e) {
            System.out.println("  a / b -> помилка: " + e.getMessage());
        }
        System.out.println("  a.equals(b) = " + a.equals(b));
    }

    public static void main(String[] args) {
        System.out.println("=== Завдання 3. Варіант 13: інтерфейс Number ===");

        // масив об'єктів типу інтерфейсу
        Number[] numbers = {
                new Integer(17),
                new Integer(5),
                new Real(2.5),
                new Real(-0.75),
                new Integer(0),
                new Integer(17)
        };

        System.out.println("\nМасив чисел (toString):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("  [" + i + "] " + numbers[i]
                    + "  тип=" + numbers[i].getTypeName()
                    + "  toDouble=" + numbers[i].toDouble());
        }

        System.out.println("\nInteger з Integer:");
        demo(numbers[0], numbers[1]);

        System.out.println("\nInteger з Real:");
        demo(numbers[1], numbers[2]);

        System.out.println("\nReal з Real:");
        demo(numbers[2], numbers[3]);

        System.out.println("\nReal з Integer:");
        demo(numbers[3], numbers[1]);

        System.out.println("\nДілення на нуль:");
        demo(numbers[0], numbers[4]);

        System.out.println("\nПеревірка equals:");
        System.out.println("  " + numbers[0] + " equals " + numbers[5] + " -> " + numbers[0].equals(numbers[5]));
        System.out.println("  " + numbers[0] + " equals " + numbers[1] + " -> " + numbers[0].equals(numbers[1]));
        Number r1 = new Real(0.1).add(new Real(0.2));
        Number r2 = new Real(0.3);
        System.out.println("  0.1+0.2 = " + r1 + " equals " + r2 + " -> " + r1.equals(r2));
        System.out.println("  Integer(2) equals Real(2.0) -> " + new Integer(2).equals(new Real(2.0)));

        System.out.println("\nСума всіх елементів масиву:");
        Number sum = new Integer(0);
        for (Number x : numbers) {
            sum = sum.add(x);
        }
        System.out.println("  " + sum);
    }
}
