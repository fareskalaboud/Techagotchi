package kcltech;

import java.util.Scanner;

/**
 * Created by Fares Alaboud on 28/10/2015.
 */
public class Creature {

    private String name;
    private int hunger;
    private int energy;
    private int happiness;


    public Creature(String name) {
        this.name = name;
        energy = 10;
        hunger = 10;
        happiness = 10;
    }

    public void decreaseEnergy(int i) {
        energy = energy - i;
    }

    public void decreaseHunger(int i) {
        hunger = hunger - i;
    }

    public void decreaseHappiness(int i) {
        happiness = happiness - i;
    }

    public String getName() {
        return name;
    }

    public void feed() {
        System.out.println("What would you like to feed " + name + "?");

        System.out.println("");
        System.out.println("1. An apple");
        System.out.println("2. A pizza");
        System.out.println("3. A jar of Nutella");
        System.out.println("4. Steak");
        System.out.println("5. McDonalds");
        System.out.println("6. Fish And Chips");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        switch(choice) {
            case 1: hunger += 2;
                break;
            case 2: hunger += 9;
                break;
            case 3: hunger += 5;
                happiness += 2;
                break;
            case 4: hunger += 8;
                break;
            case 5: hunger += 7;
                happiness -= 2;
                break;
            case 6: hunger += 7;
        }

        System.out.println("Nomnnomnom... that was good!\n");
        if (hunger > 12) { hunger = 12; }

    }

    public void play() {
        hunger = 10;
        System.out.println("Dum de dum de dum... yay! " + name + " is feeling happy!\n");
        decreaseEnergy(3);
        decreaseHunger(2);
    }

    public void sleep() {
        energy = 10;
        System.out.println("Zzzzzzzzzz... yay! " + name + " has had some rest!\n");
        decreaseHappiness(4);
        decreaseHunger(5);
    }

    public String checkStatus() {
        String status = "";
        if (happiness < 5) {
            status += "Oh no! " + name + " isn't happy! You should play with it.\n";
        }
        if (energy < 5) {
            status += "Ugh! " + name + " is getting tired! You should put it to sleep.\n";
        }
        if (hunger < 5) {
            status += "Oops! " + name + " is getting hungry! You should feed it.\n";
        }
        return status;
    }
}
