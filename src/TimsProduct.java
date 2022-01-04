public class TimsProduct implements Commodity {
    private String name;
    private double cost;
    private double price;

    TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    private String getName() {
        return name;
    }

    public double getRetailPrice() {
        return price;
    }

    public double getProductionCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "TimsProduct{" +
                "name= " + name +
                ", cost= " + cost +
                ", price= " + price +
                '}';
    }
}
