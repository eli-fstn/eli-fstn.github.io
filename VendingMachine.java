package myFirstJava.MyProjectsJAVA;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        double balance = 0.0;
        double price = 0.0;
        double result = 0.0;
        double result1 = 0.0;
        double result2 = 0.0;
        double subtotal = 0.0;
        double insertedCoin = 0.0;
        String snack = "";
        String drink = "";
        String choco = "";

        Scanner r = new Scanner(System.in);

    while(true){

        System.out.println("");
        System.out.println("==============================");
        System.out.println("Welcome to my Vending Machine");
        System.out.println("");
        System.out.println("NOTE: YOU CAN ONLY ORDER 10 PIECES(MAXIMUM) PER PRODUCT");
        System.out.println("==============================");

        System.out.print("Insert coin: ");
        double coin = r.nextDouble();
        insertedCoin = balance += coin;

        String[] snacks = {"Cheezy","Cookies","Doritos","Cheetos","Piattos",};

        System.out.println("");
        System.out.println("         " + "[SNACKS]");
        System.out.println("===========================");
        System.out.println("1. " + snacks[0] + "           " + "10 PHP");
        System.out.println("2. " + snacks[1] + "          " + "25 PHP");
        System.out.println("3. " + snacks[2] + "          " + "27 PHP");
        System.out.println("4. " + snacks[3] + "          " + "27 PHP");
        System.out.println("5. " + snacks[4] + "          " + "17 PHP");
        System.out.println("===========================");

        System.out.println("Do you want to order? 1. Yes / 2. No");
        System.out.print("Enter: ");
        int manta = r.nextInt();

        if (manta == 1){

        System.out.print("Enter your choice: ");
        int choice = r.nextInt();

        System.out.print("Enter the quantity that you want: ");
        int choice1 = r.nextInt();
        System.out.println("");

        switch (choice){

            case 1:
            snack = (choice1 + " Cheezy");
            price = 10;
            break;
            case 2:
            snack = (choice1 + " Cookies");
            price = 25;
            break;
            case 3:
            snack = (choice1 + " Doritos");
            price = 27;
            break;
            case 4:
            snack = (choice1 + " Cheetos");
            price = 27;
            break;
            case 5:
            snack = (choice1 + " Piattos");
            price = 17;
            break;
        }

        if(choice >= 6){

            System.out.println("Invalid choice, please try again.");

        }else if (choice1 > 10){

            System.out.println("You have exceeded to the limit! please try again");

        }else if (balance >= price){

            result = choice1*price;

            if (result > balance){

            System.out.println("You have exceeded to the limit! please try again");

            }if (balance >= result){

            balance -= result;
            System.out.println("Item dispensed, Thank You!");

            }

        }else{

            System.out.println("Balance insufficient, please insert more coin.");

        }
        }else{
        }

        String[] drinks = {"Cali","Coca Cola","Pepsi","Royal","Water",};

        System.out.println("");
        System.out.println("         " + "[DRINKS]");
        System.out.println("===========================");
        System.out.println("1. " + drinks[0] + "             " + "35 PHP");
        System.out.println("2. " + drinks[1] + "        " + "40 PHP");
        System.out.println("3. " + drinks[2] + "            " + "40 PHP");
        System.out.println("4. " + drinks[3] + "            " + "40 PHP");
        System.out.println("5. " + drinks[4] + "            " + "20 PHP");
        System.out.println("===========================");

        System.out.println("Do you want to order? 1. Yes / 2. No");
        System.out.print("Enter: ");
        int berry = r.nextInt();

        if (berry == 1){

        System.out.print("Enter your choice: ");
        int choice2 = r.nextInt();

        System.out.print("Enter the quantity that you want: ");
        int choice3 = r.nextInt();
        System.out.println("");

        switch (choice2){

            case 1:
            drink = (choice3 + " Cali");
            price = 35;
            break;
            case 2:
            drink = (choice3 + " Coca Cola");
            price = 40;
            break;
            case 3:
            drink = (choice3 + " Pepsi");
            price = 40;
            break;
            case 4:
            drink = (choice3 + " Royal");
            price = 40;
            break;
            case 5:
            drink = (choice3 + " Water");
            price = 20;
            break;
        }

        if(choice2 > 5){

            System.out.println("Invalid choice, please try again.");

        }else if (choice3 > 10){

            System.out.println("You have exceeded to the limit! please try again");

        }else if (balance >= price){

            result1 = choice3*price;

            if (result1 > balance){

            System.out.println("You have exceeded to the limit! please try again");

            }if (balance >= result1){

            balance -= result1;
            System.out.println("Item dispensed, Thank You!");

            }

        }else{

            System.out.println("Balance insufficient, please insert more coin.");

        }
        }else{
        }

        String[] sweets = {"Toblerone","Twix","Snickers","KitKat","M&Ms",};

        System.out.println("");
        System.out.println("       " + "[CHOCOLATES]");
        System.out.println("===========================");
        System.out.println("1. " + sweets[0] + "        " + "55 PHP");
        System.out.println("2. " + sweets[1] + "             " + "30 PHP");
        System.out.println("3. " + sweets[2] + "         " + "30 PHP");
        System.out.println("4. " + sweets[3] + "           " + "45 PHP");
        System.out.println("5. " + sweets[4] + "             " + "25 PHP");
        System.out.println("===========================");

        System.out.println("Do you want to order? 1. Yes / 2. No");
        System.out.print("Enter: ");
        int razy = r.nextInt();

        if (razy == 1){

        System.out.print("Enter your choice: ");
        int choice4 = r.nextInt();

        System.out.print("Enter the quantity that you want: ");
        int choice5 = r.nextInt();
        System.out.println("");

        switch (choice4){

            case 1:
            choco = (choice5 + " Toblerone");
            price = 55;
            break;
            case 2:
            choco = (choice5 + " Twix");
            price = 30;
            break;
            case 3:
            choco = (choice5 + " Snickers");
            price = 30;
            break;
            case 4:
            choco = (choice5 + " KitKat");
            price = 45;
            break;
            case 5:
            choco = (choice5 + " M&Ms");
            price = 25;
            break;
        }

        if(choice4 > 5){

            System.out.println("Invalid choice, please try again.");

        }else if (choice5 > 10){

            System.out.println("You have exceeded to the limit! please try again");

        }else if (balance >= price){

            result2 = choice5*price;

            if (result2 > balance){

            System.out.println("You have exceeded to the limit! please try again");

            }if (balance >= result2){

            balance -= result2;
            System.out.println("Item dispensed, Thank You!");

            }

        }else{

            System.out.println("Balance insufficient, please insert more coin.");

        }
        }else{
        }

        subtotal = (((result)+result1)+result2);

        if (subtotal > insertedCoin){

            System.out.println("");
            System.out.println("ERROR! THE SYSTEM DETECTS THAT YOUR BALANCE IS INSUFFICIENT.");

        }else if (balance < insertedCoin){

            System.out.println("");
            System.out.println("Elijah's Vending Machine");
            System.out.println("RECEIPT:");
            System.out.println("=======================================");
            System.out.println("ORDER LIST:");
            System.out.println("");

            if (result > 0){

                System.out.println(snack + "                        " + result + " PHP");

            }if (result1 > 0){

                System.out.println(drink + "                        " + result1 + " PHP");

            }if (result2 > 0){

                System.out.println(choco + "                        " + result2 + " PHP");

            }

            System.out.println("");
            System.out.println("SUBTOTAL:" + "                      " + subtotal + " PHP");
            System.out.println("BALANCE:" + "                       " + insertedCoin + " PHP");
            System.out.println("=======================================");
            System.out.println("CHANGE:" + "                        "  + balance + " PHP");
            System.out.println("=======================================");
            System.out.println("Thank You for using my Vending Machine!:)");
            System.out.println("");

        }

            System.out.println("");
            System.out.println("Do you want to order again? 1. Yes / 2. No");
            System.out.print("Enter: ");
            int x = r.nextInt();

        if (x == 2){

            System.out.println("");
            System.out.println("Thank You for using my Vending Machine!:)");

            return;

        }else{
        }
    }
}
}