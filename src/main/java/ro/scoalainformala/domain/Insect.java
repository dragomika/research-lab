package ro.scoalainformala.domain;

import java.util.Objects;

public class Insect extends Arthropod {
    private boolean canFly;

    public Insect(String name, String scientificClassification, boolean cellCount, int numberOfLegs, boolean canFly) {
        super(name, scientificClassification, cellCount, numberOfLegs);
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String eat() {
        return getName() + " feeds on nectar or other insects.";
    }

    public String reproduce() {
        return getName() + " lays eggs.";
    }

    @Override
    public String toString() {
        String flyingCapability = canFly ? "Can Fly" : "Cannot Fly";
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Cell Count: " + getCellCount() + "Number of legs: " + getNumberOfLegs() + "Flight Ability: " + flyingCapability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insect org = (Insect) o;
        return canFly == org.canFly;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCanFly());
    }
}
