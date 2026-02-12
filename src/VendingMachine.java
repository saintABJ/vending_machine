import java.util.Scanner;

/// This is the class that holds all the vending logic
//displayMenu()
//processPayment()
//dispenseItem()
//shutDown()
public class VendingMachine {

    private final Item[] items;
    private int totalCollected;
    private final Scanner scanner;

    public VendingMachine() {
        items = new Item[]{
                new Item("Water", 100, 5),
                new Item("Soda", 150, 5),
                new Item("Juice", 200, 5),
                new Item("Chips", 120, 5),
                new Item("Small Chops", 1000, 5)
        };
        totalCollected = 0;
        scanner = new Scanner(System.in);
    }

    public void start() {
        // boolean running = true;
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Transaction cancelled.");
                continue;
            }

            if (choice == 7) {
                System.out.println("Thank you for using the vending machine!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid item code. Please try again.");
                continue;
            }

            Item selectedItem = items[choice - 1];

            if (selectedItem.isOutOfStock()) {
                System.out.println(selectedItem.getName() + " is out of stock.");
                continue;
            }

            processPayment(selectedItem);
        }

        shutdown();
    }

    private void displayMenu() {
        System.out.println("\nWelcome to the vending machine!");
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            System.out.println((i + 1) + ". " + item.getName() +
                    " - ₦" + item.getPrice() +
                    " (" + item.getQuantity() + " left)");
        }
        System.out.println("6. Cancel Transaction");
        System.out.println("7. Exit");
        System.out.print("\nSelect an item: ");
    }

    private void processPayment(Item item) {

        while (true) {
            System.out.print("Enter Amount (Press 0 to cancel): ");
            int moneyInserted = scanner.nextInt();

            if (moneyInserted == 0) {
                System.out.println("Transaction cancelled.");
                return;
            }

            // This block is actually not useful here because if user enters 0, the transaction. This block will only run if user enters a -ve figure which is not an ideal situation
            if (moneyInserted < 0) {
                System.out.println("Invalid amount. Insert money greater than ₦0.");
                continue;
            }

            if (moneyInserted < item.getPrice()) {
                System.out.println("Insufficient funds. ₦" + item.getPrice() + " required.");
                continue;
            }

            dispenseItem(item, moneyInserted);
            return;
        }
    }

    private void dispenseItem(Item item, int moneyInserted) {
        System.out.println("Dispensing " + item.getName() + "...");

        int change = moneyInserted - item.getPrice();
        if (change > 0 /*|| moneyInserted == 0*/) {
            System.out.println("Change returned: ₦" + change);
        } if (moneyInserted == item.getPrice()) {
            System.out.println("You have no change.");
        }

        item.dispense();
        totalCollected += item.getPrice();
    }

    private void shutdown() {
        System.out.println("\nMachine shutting down...");
        System.out.println("Total money collected: ₦" + totalCollected);
        scanner.close();
    }
}

