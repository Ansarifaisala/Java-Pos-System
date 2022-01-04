
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class TimsOrder {
    private static ArrayList<TimsProduct> items = new ArrayList<>();
    private static Color color;
    private String name;
    private static String[] type;
    private int size;

    private TimsOrder(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public static TimsOrder create() {
        TimsProduct[] product;
        String name;
        int size;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = sc.nextLine();
        System.out.println("How Many Products do you want? ");
        size = sc.nextInt();
        type = new String[size];
        product = new TimsProduct[size];
        TimsOrder order = new TimsOrder(name, size);

        System.out.println("What is your Order: ");
        System.out.println("Items Available at the moment:(Press the number for desired item)");

        for (int i = 0; i < size; i++) {
            System.out.println("1. Mug");
            System.out.println("2. Sleeve");
            System.out.println("3. Donut");
            System.out.println("4. Mocha");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mug Selected:--");
                    Mug mug = Mug.create();
                    items.add(mug);
                    type[i] = "Type: Mug{ Color= " + mug.getColor() + " }";
                    break;
                case 2:
                    System.out.println("Sleeve Selected:--");
                    Sleeve sleeve = Sleeve.create();
                    items.add(sleeve);
                    type[i] = "Type: Sleeve{ New Year Special }";
                    break;
                case 3:
                    System.out.println("Donut Selected:--");
                    Donut donut = Donut.create();
                    items.add(donut);
                    type[i] = "Type: Donut{ Description: " + donut.getDescription() + ", Calories: " + donut.getCalorieCount() + " }";
                    break;
                case 4:
                    System.out.println("Mocha Selected:--");
                    Mocha mocha = Mocha.create();
                    items.add(mocha);
                    type[i] = "Type: Mocha{ Description: " + mocha.getDescription() + ", Calories: " + mocha.getCalorieCount() + " }";
                    break;
                default:
                    System.out.println("Please Select from the given options!");
            }
        }

        return order;
    }

    public double getAmountDue() {
        double amountDue = 0;
        for (TimsProduct item : items) {
            amountDue += item.getRetailPrice();
        }
        return amountDue;
    }


    @Override
    public String toString() {
        String output;
        int i = 0;
        output = "Order for: " + name + "\n";
        for (TimsProduct item : items) {
            output += "---------------------------------------\n";
            output += item.toString() + "\n";
            output += type[i] + "\n";
            i++;
        }
        return output;
    }
}
