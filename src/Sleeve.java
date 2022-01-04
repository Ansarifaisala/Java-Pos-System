import java.util.Scanner;

public class Sleeve extends TimsProduct {
    Sleeve(String name, double cost, double price) {
        super(name, cost, price);

    }

    public static Sleeve create() {
        double cost, price;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Cost: ");
        cost = sc.nextDouble();
        System.out.println("What is Price: ");
        price = sc.nextDouble();
        Sleeve sleeve = new Sleeve("New Year Special Sleeve", cost, price);
        return sleeve;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
