package ro.scoalainformala.domain;

import java.util.Objects;

public class Arthropod extends MulticellularOrganism {
    private int numberOfLegs;

    public Arthropod(String name, String scientificClassification, boolean cellCount, int numberOfLegs) {
        super(name, scientificClassification, cellCount);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String eat() {
        return getName() + " can be carnivore, herbivore, detritus feeder, filter feeder or parasitic.";
    }

    @Override
    public String reproduce() {
        return getName() + " lays eggs.";
    }

    @Override
    public String toString() {
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Cell Count: " + getCellCount() + "Number of legs: " + getNumberOfLegs();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arthropod org = (Arthropod) o;
        return numberOfLegs == org.numberOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfLegs());
    }
}
