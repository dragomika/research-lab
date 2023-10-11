package ro.scoalainformala.menu;

public class SecondaryMenu {
    public static String createSecondaryMenu() {
        return """   
        1 Add New Organism
        2 Microorganism
        3 Multicellular Organism
        4 Unicellular Organism
        5 Plant
        6 Animal
        7 Arthropod
        8 Algae
        9 Amoeba
        10 Insect
        11 Arachnid
        12 Go Back
                        
        Please select one of the available options ( 1 - 12 ):
        """;
    }
}
