public class Donut extends TimsProduct implements Consumable {
    private String description;
    private int calorieCount;

    Donut(String name, double cost, double price, String description, int calories) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calories;
    }

    public static Donut create() {
        Donut donut = new Donut("Glazed Donut", 0.25, 3.15, "Sugar Glazed", 250);
        return donut;
    }

    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    @Override
    public String ConsumptionMethod() {
        return "Eat it!";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
