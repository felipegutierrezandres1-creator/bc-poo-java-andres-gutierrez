public class DentalTreatment2 {
    private String name;
    private double cost;
    private int durationMinutes;

    // Constructor completo
    public DentalTreatment2(String name, double cost, int durationMinutes) {
        setName(name);
        setCost(cost);
        setDurationMinutes(durationMinutes);
    }

    // Constructor básico
    public DentalTreatment2(String name, double cost) {
        this(name, cost, 30);
    }

    // Constructor mínimo
    public DentalTreatment2(String name) {
        this(name, 0, 30);
    }

    // Getters
    public String getName() { return name; }
    public double getCost() { return cost; }
    public int getDurationMinutes() { return durationMinutes; }

    // Setters con validaciones
    public void setName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Treatment name cannot be empty");
        }
        this.name = name;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
    }

    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }
        this.durationMinutes = durationMinutes;
    }

    private boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    @Override
    public String toString() {
        return name + " - $" + cost + " - " + durationMinutes + " min";
    }
}
