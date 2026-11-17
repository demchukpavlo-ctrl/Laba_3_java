package task1;

/**
 * Підклас "Автомобіль".
 */
public class Car extends Vehicle {
    private String brand;      // марка
    private String fuelType;   // тип пального
    private int doors;         // кількість дверей

    public Car() {
        super();
        brand = "Невідомо";
        fuelType = "бензин";
        doors = 4;
    }

    public Car(String name, int maxSpeed, int capacity, int year,
               String brand, String fuelType, int doors) {
        super(name, maxSpeed, capacity, year);
        this.brand = brand;
        this.fuelType = fuelType;
        this.doors = doors;
    }

    public String getBrand() { return brand; }
    public String getFuelType() { return fuelType; }
    public int getDoors() { return doors; }

    @Override
    public String getType() {
        return "Автомобіль";
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("  Марка: " + brand);
        System.out.println("  Тип пального: " + fuelType);
        System.out.println("  Кількість дверей: " + doors);
    }

    @Override
    public String toString() {
        return super.toString() + " Car{brand='" + brand + "', fuelType='" + fuelType
                + "', doors=" + doors + "}";
    }
}
