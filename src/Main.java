//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.start();
        /*Scanner sc = new Scanner(System.in);
        boolean running = true;
        int totalCollected = 0;

        // Item quantities
        int waterQty = 5;
        int sodaQty = 5;
        int juiceQty = 5;
        int chipsQty = 5;

        while (running) {
            System.out.print("\nWelcome to the vending machine!\n");
            System.out.println("1. Water = ₦100 (" + waterQty + "left)");
            System.out.println("2. Soda = ₦150 (" + sodaQty + "left)");
            System.out.println("3. Juice = ₦200 (" + juiceQty + "left)");
            System.out.println("4. Chips = ₦120 (" + chipsQty + "left)");
            System.out.println("5. Cancel Transaction");
            System.out.println("6. Exit");

            System.out.println("\nSelect an item: ");
            int choice = sc.nextInt();

            String itemName = "";
            int price = 0;
            boolean outOfStock = false;

            switch (choice) {
                case 1:
                    itemName = "Water";
                    price = 100;
                    if (waterQty == 0) outOfStock = true;
                    break;
                case 2:
                    itemName = "Soda";
                    price = 150;
                    if (sodaQty == 0) outOfStock = true;
                    break;
                case 3:
                    itemName = "Juice";
                    price = 200;
                    if (juiceQty == 0) outOfStock = true;
                    break;
                case 4:
                    itemName = "Chips";
                    price = 120;
                    if (chipsQty == 0) outOfStock = true;
                    break;
                case 5:
                    System.out.println("Transaction Cancelled");
                    continue;
                case 6:
                    System.out.println("Thank you for using the vending machine!");
                    running = false;
                    continue;
                default:
                    System.out.println("Invalid Item Code. Please try again.");
                    continue;
            }

            if (outOfStock) {
                System.out.println(itemName + " is out of stock.");
                continue;
            }

            System.out.println("Insert Money: ");
            int moneyInserted = sc.nextInt();

            if (moneyInserted <= 0) {
                System.out.println("Invalid amount. Please insert money greater than ₦0.");
                continue;
            }
            if (moneyInserted < price) {
                System.out.println("Insufficient funds ₦" + price + " required");
                continue;
            }
            // Successful Transaction
            System.out.println("Dispensing " + itemName + "...");

            int change = moneyInserted - price;
            if (change > 0) {
                System.out.println("Change returned: ₦" + change);
            }

            totalCollected += price;

            // Reduce item quantity
            switch (choice) {
                case 1: waterQty--; break;
                case 2: sodaQty--; break;
                case 3: juiceQty--; break;
                case 4: chipsQty--; break;
            }
        }

        System.out.println("\nMachine shutting down...");
        System.out.println("Total money collected: ₦" + totalCollected);
        sc.close();*/
    }
}