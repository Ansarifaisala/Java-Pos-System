
public class Mocha extends TimsProduct implements Consumable {
    private String description;
    private int calorieCount;

    Mocha(String name, double cost, double price, String description, int calories) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calories;
    }

    public static Mocha create() {
        Mocha mocha = new Mocha("Mocha is Best Drink", 0.39, 4.50, "Half Coffee and Half Chocolate", 259);
        return mocha;
    }

    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    @Override
    public String ConsumptionMethod() {
        return "Drink it!";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
