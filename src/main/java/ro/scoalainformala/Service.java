package ro.scoalainformala;

import ro.scoalainformala.domain.*;

import java.util.Scanner;

import static ro.scoalainformala.menu.SecondaryMenu.createSecondaryMenu;

public class Service {
    private static Organism[] organisms = new Organism[100];
    private static int entryCount = 0;

    public static String addNewOrganism() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the organism: ");
        String name = scanner.next();
        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.next();
        organisms[entryCount] = new Organism(name, scientificClassification);
        entryCount++;
        return name + " added";
    }

    public static String addMicroorganism() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the microorganism: ");
        String name = scanner.nextLine();
        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.next();
        System.out.println("Enter the physical requirement: ");
        String physicalRequirement = scanner.next();

        organisms[entryCount] = new Microorganism(name, scientificClassification, physicalRequirement);
        entryCount++;
        return name + " added";
    }

    public static String addUnicellularOrganism() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the unicellular organism: ");
        String name = scanner.nextLine();
        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();
        System.out.println("Enter the physical requirement: ");
        String physicalRequirement = scanner.nextLine();
        System.out.println("Does it have a nucleus? (true or false): ");
        boolean hasNucleus = scanner.nextBoolean();
        scanner.nextLine();

        organisms[entryCount] = new UnicellularOrganism(name, scientificClassification, physicalRequirement, hasNucleus);
        entryCount++;
        return name + " added";
    }

    public static String addMulticellularOrganism() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the multicellular organism: ");
        String name = scanner.nextLine();
        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();
        System.out.println("Does it has multiple cells? (true/false): ");
        boolean cellCount = scanner.nextBoolean();
        scanner.nextLine();

        organisms[entryCount] = new MulticellularOrganism(name, scientificClassification, cellCount);
        entryCount++;
        return name + " added";
    }

    public static String addPlant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the plant: ");
        String name = scanner.nextLine();
        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();
        System.out.println("Does it have multiple cells? (true or false): ");
        boolean cellCount = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter the habitat: ");
        String habitat = scanner.nextLine();
        System.out.println("Enter the type of soil it requires: ");
        String soilType = scanner.nextLine();
        System.out.println("Enter the amount of sunlight it needs (in hours per day): ");
        int sunlightRequired = scanner.nextInt();

        organisms[entryCount] = new Plant(name, scientificClassification, cellCount, habitat, soilType, sunlightRequired);
        entryCount++;
        return name + " added";
    }

    public static String addAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the animal: ");
        String name = scanner.nextLine();

        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();

        System.out.println("Does it have multiple cells? (true or false): ");
        boolean cellCount = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Enter the type of habitat: ");
        String habitat = scanner.nextLine();

        System.out.println("Enter the diet of the animal: ");
        String diet = scanner.nextLine();

        organisms[entryCount] = new Animal(name, scientificClassification, cellCount, habitat, diet);
        entryCount++;

        return name + " added";
    }

    public static String addArthropod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the arthropod: ");
        String name = scanner.nextLine();

        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();

        System.out.println("Does it have multiple cells? (true or false): ");
        boolean cellCount = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Enter the number of legs: ");
        int numberOfLegs = scanner.nextInt();

        organisms[entryCount] = new Arthropod(name, scientificClassification, cellCount, numberOfLegs);
        entryCount++;

        return name + " added";
    }

    public static String addAlgae() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the algae: ");
        String name = scanner.nextLine();

        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();

        System.out.println("Enter the physical requirement: ");
        String physicalRequirement = scanner.nextLine();

        System.out.println("Enter the water type it thrives in: ");
        String waterType = scanner.nextLine();

        System.out.println("Enter the pigment: ");
        String pigmentCategory = scanner.nextLine();

        organisms[entryCount] = new Algae(name, scientificClassification, physicalRequirement, waterType, pigmentCategory);
        entryCount++;

        return name + " added";
    }

    public static String addAmoeba() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the amoeba: ");
        String name = scanner.nextLine();

        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();

        System.out.println("Is the amoeba parasiti? (true/false)");
        boolean isParasitic = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter the physical requirements (e.g., water, temperature): ");
        String physicalRequirements = scanner.nextLine();


        organisms[entryCount] = new Amoeba(name, scientificClassification, physicalRequirements, isParasitic);
        entryCount++;

        return name + " added";
    }

    public static String addInsect() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the insect: ");
        String name = scanner.nextLine();

        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();

        System.out.println("Does it have multiple cells? (true or false): ");
        boolean cellCount = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Enter the number of legs: ");
        int numberOfLegs = scanner.nextInt();

        System.out.println("Can it fly? (true/false)");
        boolean canFly = scanner.nextBoolean();

        organisms[entryCount] = new Insect(name, scientificClassification, cellCount, numberOfLegs, canFly);
        entryCount++;

        return name + " added";
    }

    public static String addArachnid() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the arachnid: ");
        String name = scanner.nextLine();

        System.out.println("Enter the scientific classification: ");
        String scientificClassification = scanner.nextLine();

        System.out.println("Does it have multiple cells? (true or false): ");
        boolean cellCount = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Enter the number of legs: ");
        int numberOfLegs = scanner.nextInt();

        System.out.println("Does it have spinnerets? (true/false)");
        boolean hasSpinnerets = scanner.nextBoolean();
        scanner.nextLine();

        organisms[entryCount] = new Arachnid(name, scientificClassification, cellCount, numberOfLegs, hasSpinnerets);
        entryCount++;

        return name + " added";
    }

    public static String listAllOrganisms() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of Organisms:");

        int organismCount = 0;

        for (int i = 0; i < organisms.length; i++) {
            if (organisms[i] != null) {
                organismCount++;
                System.out.println(organismCount + ". " + organisms[i].getName());

            }
        }

        System.out.println(organismCount + 1 + ". " + "Go Back");

        System.out.println("Enter the number of the organism to view details:");
        int selection = scanner.nextInt();

        String invalid = "";
        if (selection == organismCount + 1) {
            return "";
        } else if (selection >= 1 && selection <= organismCount) {
            Organism selectedOrganism = organisms[selection - 1];
            System.out.println(selectedOrganism.toString());
            } else {
                invalid = "Invalid selection.";
            }

        return invalid;
    }

}
