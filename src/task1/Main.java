package task1;

import java.util.Scanner;

/**
 * Завдання 1, варіант 11.
 * Ієрархія: Транспортний засіб (Vehicle) -> Автомобіль (Car), Поїзд (Train) -> Експрес (Express).
 * Програма вводить об'єкти в масив типу суперкласу та друкує його методом Show().
 */
public class Main {

    private static int readInt(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = in.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("  Помилка: введіть ціле число.");
            }
        }
    }

    private static String readString(Scanner in, String prompt) {
        System.out.print(prompt);
        return in.nextLine().trim();
    }

    private static Vehicle readVehicle(Scanner in) {
        System.out.println("Оберіть тип: 1 - Транспортний засіб, 2 - Автомобіль, 3 - Поїзд, 4 - Експрес");
        int type;
        do {
            type = readInt(in, "Тип: ");
        } while (type < 1 || type > 4);

        String name = readString(in, "Назва: ");
        int speed = readInt(in, "Макс. швидкість (км/год): ");
        int capacity = readInt(in, "Місткість (пасажирів): ");
        int year = readInt(in, "Рік випуску: ");

        switch (type) {
            case 2: {
                String brand = readString(in, "Марка: ");
                String fuel = readString(in, "Тип пального: ");
                int doors = readInt(in, "Кількість дверей: ");
                return new Car(name, speed, capacity, year, brand, fuel, doors);
            }
            case 3: {
                int wagons = readInt(in, "Кількість вагонів: ");
                String route = readString(in, "Маршрут: ");
                return new Train(name, speed, capacity, year, wagons, route);
            }
            case 4: {
                int wagons = readInt(in, "Кількість вагонів: ");
                String route = readString(in, "Маршрут: ");
                int stops = readInt(in, "Кількість зупинок: ");
                String wifi = readString(in, "Є Wi-Fi? (так/ні): ");
                boolean hasWifi = wifi.equalsIgnoreCase("так") || wifi.equalsIgnoreCase("y")
                        || wifi.equalsIgnoreCase("yes") || wifi.equals("1");
                return new Express(name, speed, capacity, year, wagons, route, stops, hasWifi);
            }
            default:
                return new Vehicle(name, speed, capacity, year);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        run(in);
        in.close();
    }

    /** Запуск завдання з уже відкритим Scanner (використовується з меню). */
    public static void run(Scanner in) {
        System.out.println("=== Завдання 1. Варіант 11: транспортні засоби ===");

        int n;
        do {
            n = readInt(in, "Скільки об'єктів ввести? ");
        } while (n <= 0);

        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Об'єкт №" + (i + 1) + " ---");
            vehicles[i] = readVehicle(in);
        }

        System.out.println("\n=== Введений масив ===");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.print((i + 1) + ". ");
            vehicles[i].Show(); // поліморфний виклик
        }
        System.out.println("\nВсього створено транспортних засобів: " + Vehicle.count);
    }
}
