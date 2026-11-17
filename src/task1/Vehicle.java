package task1;

/**
 * Суперклас "Транспортний засіб".
 */
public class Vehicle {
    private String name;       // назва / модель
    private int maxSpeed;      // максимальна швидкість, км/год
    private int capacity;      // кількість пасажирських місць
    private int year;          // рік випуску

    public static int count = 0; // кількість створених транспортних засобів

    {
        name = "Невідомо";
        maxSpeed = 0;
        capacity = 0;
        year = 2000;
    }

    public Vehicle() {
        count++;
    }

    public Vehicle(String name, int maxSpeed, int capacity, int year) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.year = year;
        count++;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    /** Тип об'єкта для виводу. */
    public String getType() {
        return "Транспортний засіб";
    }

    /** Виводить дані про об'єкт. */
    public void Show() {
        System.out.println("[" + getType() + "]");
        System.out.println("  Назва: " + name);
        System.out.println("  Макс. швидкість: " + maxSpeed + " км/год");
        System.out.println("  Місткість: " + capacity + " пас.");
        System.out.println("  Рік випуску: " + year);
    }

    @Override
    public String toString() {
        return getType() + "{name='" + name + "', maxSpeed=" + maxSpeed
                + ", capacity=" + capacity + ", year=" + year + "}";
    }
}
