package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	int choice = 0;
        while (choice != 3) {
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                petFile.setBreed("German Shepperd");
                break;
            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                petFile.setNoofLives(9);
                break;
            case 3:
                System.out.println("Thank you...");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
            	
        }
        if (choice == 3) {
            break;
        }
        

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());
       
        if (choice == 1) {
        	System.out.println("Breed: " + petFile.getBreed());
        }
        if (choice ==2) {
        	System.out.println("No of Lives: " + petFile.getNoofLives());
        }
    }
    }
}
    
