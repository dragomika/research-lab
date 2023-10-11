package ro.scoalainformala.domain;


import java.util.Objects;

public class Microorganism extends Organism {
    private String physicalRequirement;

    public Microorganism(String name, String scientificClassification, String physicalRequirement) {
        super(name, scientificClassification);
        this.physicalRequirement = physicalRequirement;
    }

    public String getPhysicalRequirement() {
        return physicalRequirement;
    }

    public void setPhysicalRequirement(String physicalRequirement) {
        this.physicalRequirement = physicalRequirement;
    }

    @Override
    public String eat() {
        return getName() + " breaks down dead organisms, animal waste and plant litter to obtain nutrients.";
    }

    @Override
    public String reproduce() {
        return getName() + " reproduces through binary fission or splitting into two cells.";
    }


    @Override
    public String toString() {
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Physical Requirement: " + physicalRequirement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Microorganism org = (Microorganism) o;
        return physicalRequirement.equals(org.physicalRequirement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhysicalRequirement());
    }
}