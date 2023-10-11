package ro.scoalainformala.menu;

public class Menu {
    public static String createMenu() {
        return """
        Welcome to Organism Collector (property of Acme Inc.)
                        
        1 Add a new organism
        2 List all added organisms
        3 Exit
                        
        Please select one of the available options ( 1 - 3 ):
        """;
    }
}
