package task1;

/**
 * Підклас "Поїзд".
 */
public class Train extends Vehicle {
    private int wagons;        // кількість вагонів
    private String route;      // маршрут

    public Train() {
        super();
        wagons = 1;
        route = "Невідомо";
    }

    public Train(String name, int maxSpeed, int capacity, int year,
                 int wagons, String route) {
        super(name, maxSpeed, capacity, year);
        this.wagons = wagons;
        this.route = route;
    }

    public int getWagons() { return wagons; }
    public String getRoute() { return route; }

    @Override
    public String getType() {
        return "Поїзд";
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("  Кількість вагонів: " + wagons);
        System.out.println("  Маршрут: " + route);
    }

    @Override
    public String toString() {
        return super.toString() + " Train{wagons=" + wagons + ", route='" + route + "'}";
    }
}
