package lesson20240228;

public enum Coffee {

    CAPPUCCINO(80, "Cappucino description"),
    LATTE(80, "Latte description"),
    AMERICANO(70, "Americano description"),
    ESPRESSO(50, "Espresso description"),
    MACCHIATO(80, "Macciato description");

    private final int cost;
    private final String description;

    Coffee(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name() + "{" +
                "cost=" + cost + " cents, " +
                "description='" + description + '\'' +
                '}';
    }
}
