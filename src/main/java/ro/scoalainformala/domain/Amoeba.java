package ro.scoalainformala.domain;

import java.util.Objects;

public class Amoeba extends Microorganism {
    private boolean isParasitic;

    public Amoeba(String name, String scientificClassification, String physicalRequirement, boolean isParasitic) {
        super(name, scientificClassification, physicalRequirement);
        this.isParasitic = isParasitic;
    }

    public boolean getIsParasitic() {
        return isParasitic;
    }

    public void setIsParasitic(boolean parasitic) {
        isParasitic = parasitic;
    }

    @Override
    public String eat() {
        return getName() + " eats through phagocytosis.";
    }

    @Override
    public String reproduce() {
        return getName() + " undergoes binary fission to reproduce.";
    }

    @Override
    public String toString() {
        String parasiticStatus = isParasitic ? "Parasitic" : "Free-living";
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Physical Requirement: " + getPhysicalRequirement() + "Parasitic: " + parasiticStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amoeba org = (Amoeba) o;
        return isParasitic == org.isParasitic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsParasitic());
    }
}
