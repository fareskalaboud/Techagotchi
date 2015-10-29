package kcltech;

import java.util.Scanner;

/**
 * Created by Fares Alaboud on 28/10/2015.
 */
public class Game {
    private boolean userChoseToQuit;
    private Creature myCreature;
    private Scanner input = new Scanner(System.in);

    public void run() {
        userChoseToQuit = false;

        startTutorial();
        while (!userChoseToQuit) {
            interact();
        }

        print("Awwh. :( Time to put " + myCreature.getName() + " \"to sleep\".");
    }

    private void startTutorial() {
        print("Welcome to Techagotchi!");
        print("");
        print("Let's create a name for your new creature.");
        print("What would you like to call it?");

        String name = input.nextLine();

        myCreature = new Creature(name);

        print("");
        print("Fantastic! Congratulations, you've created a new creature by the name of " + name + ".");

        print("");
        print("Let's start interacting with " + name + "!");

    }

    private void interact() {
        print(myCreature.checkStatus());
        print("");
        print("What would you like to do with " + myCreature.getName() + "?");
        print("1. PLAY");
        print("2. FEED");
        print("3. SLEEP");
        print("4. QUIT");
        print("");

        int choice = input.nextInt();

        switch (choice) {
            case 1: myCreature.play();
                break;
            case 2: myCreature.feed();
                break;
            case 3: myCreature.sleep();
                break;
            case 4: userChoseToQuit = true;
                break;
            default: break;
        }
    }

    private void print(String s) {
        System.out.println(s);
    }

}
