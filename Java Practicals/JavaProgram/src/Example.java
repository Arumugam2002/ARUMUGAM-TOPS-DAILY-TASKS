import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallPizzaPrice = 150;
        int mediumPizzaPrice = 250;
        int largePizzaPrice = 500;
        int monsterPizzaPrice = 700;

        int smallPizzaCount = 0;
        int mediumPizzaCount = 0;
        int largePizzaCount = 0;
        int monsterPizzaCount = 0;

        int totalPrice = 0;

        while (true) {
            System.out.println("Choose your pizza size:");
            System.out.println("1. Small (150 rupees)");
            System.out.println("2. Medium (250 rupees)");
            System.out.println("3. Large (500 rupees)");
            System.out.println("4. Monster (700 rupees)");
            System.out.println("5. Done ordering");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    smallPizzaCount++;
                    if (smallPizzaCount % 4 == 0) {
                        System.out.println("Congratulations! You get a 500ml coke free!");
                    }
                    totalPrice += smallPizzaPrice;
                    break;
                case 2:
                    mediumPizzaCount++;
                    if (mediumPizzaCount % 3 == 0) {
                        System.out.println("Congratulations! You get 11t coke free!");
                    }
                    totalPrice += mediumPizzaPrice;
                    break;
                case 3:
                    largePizzaCount++;
                    if (largePizzaCount % 2 == 0) {
                        System.out.println("Congratulations! You get a 1lt ice cream free!");
                    }
                    totalPrice += largePizzaPrice;
                    break;
                case 4:
                    monsterPizzaCount++;
                    if (monsterPizzaCount % 5 == 0) {
                        System.out.println("Congratulations! You get all coke (1.5 liter + ice) free!");
                    }
                    totalPrice += monsterPizzaPrice;
                    break;
                case 5:
                    System.out.println("Your total price is: " + totalPrice + " rupees.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose from 1 to 5.");
            }
        }
    }
}
