package com.bridgelabz;

import java.util.Scanner;
import java.util.Set;

public class BirdSanctuary {
    public static void main(String[] args) {
        int input = 0;
        int choice=0;
        do {
            System.out.println("Main menu: \n1.Add Bird \n2.Delete Bird\n3.Display Bird\n4.Update Bird.\n5.Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            BirdSanctuary birdSanctuary = new BirdSanctuary();
            birdSanctuary.getSelectChoice(choice);

        }while (choice != 5);
    }
    public void getSelectChoice(int choice ){
        switch ( choice){
            case 1:
                createBird();
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
               // BirdRepository birdRepository = new BirdRepository();
                displayBirds();
                break;
            case 4:
                System.out.println("");
                break;
            case 5:
                System.out.println("Thank you");
                break;
            default:
                System.out.println("its a valid");
        }
    }

    private void displayBirds() {
    UserInterface userInterface = new UserInterface();
    BirdRepository birdRepository = BirdRepository.getInstance();
    userInterface.displayBirds(birdRepository.getBirdList());
    }
    private void createBird() {
        Bird bird = new Bird();
        UserInterface userInterface = new UserInterface();
        userInterface.getDetails(bird);
        System.out.println(bird);
        BirdRepository birdRepository = BirdRepository.getInstance();
        birdRepository.addBird(bird);
    }
}
