import java.util.Scanner;

public class SlushIceUI {

    public static void main(String[] args) {

        SlushIceUI ui = new SlushIceUI();

        Scanner scan = new Scanner(System.in);

        SlushIceFlavor rasphberry = new SlushIceFlavor("Rasphberry-flavor", 25.99);
        SlushIceFlavor blueberry = new SlushIceFlavor("Blueberry-flavor", 23.00);
        SlushIceFlavor strawberry = new SlushIceFlavor("Strawberry-flavor", 24.50);

        //Creating customer cart
        CustomerSlushIceCart cart1 = new CustomerSlushIceCart();


        SlushIceAutomat automat = new SlushIceAutomat("SlushIce-Machine");

        automat.addFlavor(rasphberry);
        automat.addFlavor(blueberry);
        automat.addFlavor(strawberry);


        System.out.println();
        System.out.println("Welcome to my Slush ice machine called: " + automat.getShopName() + " which has " + automat.amountOfVariants() + " flavors!");

        System.out.println("What would you like to do?");

        int userInput = 0;
        double total = 0;

        boolean running = true;

        while (running) {
            System.out.println("\n");
            ui.printMenu();
            userInput = scan.nextInt();

            System.out.println("\n");

            switch (userInput) {
                case 1 -> {
                    System.out.println("Flavors for sale:");
                    int e = 1;
                    for (int i = 0; i < automat.amountOfVariants(); i++) {
                        System.out.println(e + ": " + automat.getShopFlavors().get(i));
                        e++;
                    }
                }
                case 2 -> {
                    while (userInput != 4) {
                        System.out.println("What would you like to buy?");
                        int e = 1;
                        for (int i = 0; i < automat.amountOfVariants(); i++) {
                            System.out.println(e + ": " + automat.getShopFlavors().get(i));
                            e++;
                        }
                        System.out.println("4: Back to the menu");
                        userInput = scan.nextInt();
                        if (userInput == 1) {
                            System.out.println("Rasphberry slush ice has been added to your cart!\n");
                            cart1.addToCart(rasphberry);
                        } else if (userInput == 2) {
                            System.out.println("Blueberry slush ice has been added to your cart!\n");
                            cart1.addToCart(blueberry);

                        } else if (userInput == 3) {
                            System.out.println("Strawberry slush ice has been added to your cart!\n");
                            cart1.addToCart(strawberry);
                        } else if (userInput == 4) {
                            System.out.println("Going back to menu...");
                        } else {
                            System.out.println("Invalid input");
                        }
                    }
                }
                case 3 -> {
                    for (int i = 0; i < cart1.userCart.size(); i++) {
                        total += cart1.userCart.get(i).getFlavorPrice();
                    }
                    //souf AKA. printf hjælper mig med at vise en specifik mængde af decimaler efter total ved brug af %.2f
                    System.out.printf("Total: %.2fDKK", total);

                }
                case 4 -> {
                    System.out.println("Exiting vending machine...");
                    running = false;

                }
                default -> System.out.println("Invalid choice, please try again");
            }
        }
    }


    public void printMenu() {
        System.out.println("1: See what flavors are for sale");
        System.out.println("2: Buy flavors");
        System.out.println("3: See total and checkout");
        System.out.println("4: Exit Program/Machine");
    }
}
