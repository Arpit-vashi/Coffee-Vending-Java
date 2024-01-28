import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        int balance,addbal;
        System.out.println("Enter Amount you Entered:");
        int amount = scanner.nextInt();
        balance = amount;

        while (!exit) {
            System.out.println("\nYour Current Balance is:"+ balance +"\n");
            System.out.println("Choose your coffee type:");
            System.out.println("1. Espresso (150 RS)");
            System.out.println("2. Latte (140 Rs)");
            System.out.println("3. Americano (140 Rs)");
            System.out.println("4. Mocha (160 Rs)");
            System.out.println("5. Choclate MilkShake (200 Rs)");
            System.out.println("0. Exit");
            System.out.println("9. Add Balance");
            System.out.println("\n Enter your choise:");

            int choice = scanner.nextInt();
            CoffeeMachine coffeeMachine = null;

            switch (choice) {
                case 1:
                    if (balance >= 150)
                    {
                    coffeeMachine = new EspressoCoffee();
                    amount = 150;
                    balance = balance-amount;
                    break;
                    }
                    else
                    {
                        System.out.println("Amount is insufficient");
                        break;
                    }
                case 2:
                    if (balance >= 140)
                    {
                    coffeeMachine = new LatteCoffee();
                        amount = 150;
                        balance = balance-amount;
                    break;
                    }
                    else
                    {
                        System.out.println("Amount is insufficient");
                        break;
                    }
                case 3:
                    if (balance >= 140)
                    {
                    coffeeMachine = new AmericanoCoffee();
                        amount = 150;
                        balance = balance-amount;
                        break;
                    }
                    else
                    {
                        System.out.println("Amount is insufficient");
                        break;
                    }
                case 4:
                    if (balance >= 160)
                    {
                    coffeeMachine = new Mocha();
                        amount = 150;
                        balance = balance-amount;
                        break;
                    }
                    else
                    {
                        System.out.println("Amount is insufficient");
                        break;
                    }
                case 5:
                    if (balance >= 200)
                    {
                    coffeeMachine = new ChoclateMilkShake();
                        amount = 150;
                        balance = balance-amount;
                        break;
                    }
                    else
                    {
                        System.out.println("Amount is insufficient");
                        break;
                    }
                case 9:
                    System.out.println("Enter the amount you Entered:");
                    addbal = scanner.nextInt();
                    balance= balance + addbal;
                    break;

                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            if (coffeeMachine != null) {
                coffeeMachine.makeCoffee();
            }
        }

        System.out.println("Exiting the Coffee Machine. Have a great day!");
        scanner.close();
    }
}

abstract class CoffeeMachine {
    protected abstract void cup();
    protected abstract void addWater();
    protected abstract void addCoffee();
    protected abstract void addMilk();
    protected abstract void addSugar();
    protected void addChoclateSyrup(){
        System.out.println("Add 30ml of Choclate Syrup");
    };
    protected void addIce(){
        System.out.println("Add 4 cubes of Ice");
    };
    protected abstract void brew();
    protected abstract void heat();
    protected abstract void fill();
    protected abstract void enjoy();
    public final void makeCoffee() {
        cup();
        addWater();
        addCoffee();
        addMilk();
        addSugar();
        addChoclateSyrup();
        addIce();
        brew();
        heat();
        fill();
        enjoy();
    }
}

class EspressoCoffee extends CoffeeMachine {
    protected void cup(){
        System.out.println("Take a paper Cup(300ml)+Lid");
    }
    protected void addWater() {
        System.out.println("Adding 270ml of hot water.");
    }
    protected void addCoffee() {
        System.out.println("Adding 15g of espresso coffee powder.");
    }
    protected void addMilk() {
        // No milk for espresso
    }
    protected void addSugar() {
        // No sugar for espresso
    }
    protected void brew() {
        System.out.println("Brewing espresso coffee.");
    }
    protected void heat(){
        System.out.println("Heat the pot at 200 degree for 20 seconds");
    }
    protected void fill(){
        System.out.println("Empty content to the cup");
    }
    protected void enjoy(){
        System.out.println("Enjoy Your Espresso Coffee Coffe :)");
    }
}

class LatteCoffee extends CoffeeMachine {
    protected void cup(){
        System.out.println("Take a paper Cup(50ml)+Lid");
    }
    protected void addWater() {
        System.out.println("Adding 30ml of hot water.");
    }

    protected void addCoffee() {
        System.out.println("Adding 20g of coffee powder.");
    }

    protected void addMilk() {
        System.out.println("Adding 100ml of steamed milk.");
    }

    protected void addSugar() {
        System.out.println("Adding 20g of sugar.");
    }
    protected void brew() {
        System.out.println("Brewing latte coffee.");
    }
    protected void heat(){
        System.out.println("Heat the pot at 200 degree for 10 seconds");
    }
    protected void fill(){
        System.out.println("Empty content to the cup");
    }
    protected void enjoy(){
        System.out.println("Enjoy Your Latte Coffee Coffe :)");
    }
}

class AmericanoCoffee extends CoffeeMachine {
    protected void cup(){
        System.out.println("Take a paper Cup(200ml)+Lid");
    }
    protected void addWater() {
        System.out.println("Adding 150ml of hot water.");
    }
    protected void addCoffee() {
        System.out.println("Adding 20g of coffee powder.");
    }
    protected void addMilk() {
        // No milk for Americano
    }
    protected void addSugar() {
        // No sugar for Americano
    }
    protected void brew() {
        System.out.println("Brewing Americano coffee.");
    }
    protected void heat(){
        System.out.println("Heat the pot at 50 degree for 200 seconds");
    }
    protected void fill(){
        System.out.println("Empty content to the cup");
    }
    protected void enjoy(){
        System.out.println("Enjoy Your Americano Coffee Coffe :)");
    }
}
class Mocha extends CoffeeMachine {
    protected void cup(){
        System.out.println("Take a paper Cup(100ml)+Lid");
    }
    protected void addWater() {
        // No water for Mocha
    }
    protected void addCoffee() {
        System.out.println("Adding 30g of coffee powder.");
    }
    protected void addMilk() {
        System.out.println("Adding 50ml of steamed milk.");
    }
    protected void addSugar() {
        System.out.println("Adding 5g Sugar");
    }
    public void addChoclateSyrup(){};
    protected void brew() {
        System.out.println("Brewing Mocha coffee.");
    }
    protected void heat(){
        System.out.println("Heat the pot at 50 degree for 200 seconds");
    }
    protected void fill(){
        System.out.println("Empty content to the cup");
    }
    protected void enjoy(){
        System.out.println("Enjoy Your Mocha Coffe :)");
    }
}
class ChoclateMilkShake extends CoffeeMachine {
    protected void cup(){
        System.out.println("Take a Plastic Cup(200ml)+Lid+Straw");
    }
    protected void addWater() {
        // No milk for MilkShake
    }
    protected void addCoffee() {
        // No Coffe for MilkShake
    }
    protected void addMilk() {
        System.out.println("Adding 150ml milk");
    }
    protected void addSugar() {
        // No sugar for MilkShake
    }
    protected void brew() {
        System.out.println("Brewing Choclate MilkShake.");
    }
    protected void heat(){
        // No heat for MilkShake
    }
    protected void fill(){
        System.out.println("Empty content to the cup");
    }
    protected void enjoy(){
        System.out.println("Enjoy Your MilkShake :)");
    }
}