package ro.scoalainformala.domain;

import java.util.Objects;

public class Arachnid extends Arthropod {
    private boolean hasSpinnerets;

    public Arachnid(String name, String scientificClassification, boolean cellCount, int numberOfLegs, boolean hasSpinnerets) {
        super(name, scientificClassification, cellCount, numberOfLegs);
        this.hasSpinnerets = hasSpinnerets;
    }

    public boolean getHasSpinnerets() {
        return hasSpinnerets;
    }

    public void setHasSpinnerets(boolean hasSpinnerets) {
        this.hasSpinnerets = hasSpinnerets;
    }

    @Override
    public String eat() {
        return getName() + " hunts insects or other small prey.";
    }

    @Override
    public String reproduce() {
        return getName() + " lays eggs.";
    }

    @Override
    public String toString() {
        String spinneretsPossession = hasSpinnerets ? "Has Spinnerets" : "Does Not Have Spinnerets";
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Cell Count: " + getCellCount() + "Number of legs: " + getNumberOfLegs() + "Spinnerets: " + spinneretsPossession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arachnid org = (Arachnid) o;
        return hasSpinnerets == org.hasSpinnerets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasSpinnerets);
    }
}
