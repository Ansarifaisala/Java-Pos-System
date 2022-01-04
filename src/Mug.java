import javafx.scene.paint.Color;

import java.util.Scanner;


public class Mug extends TimsProduct {
    private Color color;

    private Mug(String name, double cost, double price, Color color) {
        super(name, cost, price);
        this.color = color;
    }

    public static Mug create() {

        double cost, price;
        String color;
        Scanner sc = new Scanner(System.in);
        System.out.println("What Color: ");
        color = sc.nextLine();
        System.out.println("What is Cost: ");
        cost = sc.nextDouble();
        System.out.println("What is Price: ");
        price = sc.nextDouble();
        Color c = Color.web(color);
        Mug mug = new Mug("Tim's Coffee Mug", cost, price, c);
        return mug;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
