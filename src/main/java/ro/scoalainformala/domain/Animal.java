package ro.scoalainformala.domain;

import java.util.Objects;

public class Animal extends MulticellularOrganism {
    private String habitat;
    private String diet;

    public Animal(String name, String scientificClassification, boolean cellCount, String habitat, String diet) {
        super(name, scientificClassification, cellCount);
        this.habitat = habitat;
        this.diet = diet;
    }

    public String getHabitat() {
        return habitat;
    }
    public String getDiet() {
        return diet;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void setDiet(String diet) {
        this.diet = diet;
    }
    @Override
    public String eat() {
        return getName() + " can be omnivore, carnivore or herbivore";
    }

    @Override
    public String reproduce() {
        return getName() + " gives birth to offspring.";
    }

    @Override
    public String toString() {
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Cell Count: " + getCellCount() + "Habitat: " + habitat + "Diet: " + diet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal org = (Animal) o;
        return habitat.equals(org.habitat) && diet.equals(org.diet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabitat(), getDiet());
    }
}