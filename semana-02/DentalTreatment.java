
public class DentalTreatment {
    private String name;
    private double cost;
    private int durationMinutes;

    public DentalTreatment(String name, double cost, int durationMinutes) {
        this.name = name;
        this.cost = cost;
        this.durationMinutes = durationMinutes;
    }

    public String getSummary() {
        return name + " - $" + cost + " - " + durationMinutes + " min";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }
}