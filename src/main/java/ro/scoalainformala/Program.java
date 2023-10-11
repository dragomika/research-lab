package ro.scoalainformala;

import ro.scoalainformala.domain.*;
import ro.scoalainformala.menu.Menu;
import ro.scoalainformala.menu.SecondaryMenu;

import java.util.Scanner;



public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        int secondaryOption;
        do {
            System.out.println(Menu.createMenu());
            option = scanner.nextInt();

            String result = switch (option) {
                case 1 -> {
                    do {
                        System.out.println(SecondaryMenu.createSecondaryMenu());
                        secondaryOption = scanner.nextInt();

                        String secondaryResult = switch (secondaryOption) {
                            case 1 -> Service.addNewOrganism();
                            case 2 -> Service.addMicroorganism();
                            case 3 -> Service.addMulticellularOrganism();
                            case 4 -> Service.addUnicellularOrganism();
                            case 5 -> Service.addPlant();
                            case 6 -> Service.addAnimal();
                            case 7 -> Service.addArthropod();
                            case 8 -> Service.addAlgae();
                            case 9 -> Service.addAmoeba();
                            case 10 -> Service.addInsect();
                            case 11 -> Service.addArachnid();
                            case 12 -> Menu.createMenu();
                            default -> "Invalid option";
                        };
                        yield secondaryResult;
                    } while (secondaryOption != 12);
                }
                case 2 -> Service.listAllOrganisms();
                case 3 -> "Goodbye!";
                default -> "Invalid option";
            };
            System.out.println(result);
        } while (option != 3);
    }

}

