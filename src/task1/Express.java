package task1;

/**
 * Підклас "Експрес" (швидкісний поїзд) — нащадок класу Поїзд.
 */
public class Express extends Train {
    private int stops;             // кількість зупинок
    private boolean hasWifi;       // наявність Wi-Fi

    public Express() {
        super();
        stops = 0;
        hasWifi = false;
    }

    public Express(String name, int maxSpeed, int capacity, int year,
                   int wagons, String route, int stops, boolean hasWifi) {
        super(name, maxSpeed, capacity, year, wagons, route);
        this.stops = stops;
        this.hasWifi = hasWifi;
    }

    public int getStops() { return stops; }
    public boolean isHasWifi() { return hasWifi; }

    @Override
    public String getType() {
        return "Експрес";
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("  Кількість зупинок: " + stops);
        System.out.println("  Wi-Fi: " + (hasWifi ? "так" : "ні"));
    }

    @Override
    public String toString() {
        return super.toString() + " Express{stops=" + stops + ", hasWifi=" + hasWifi + "}";
    }
}
