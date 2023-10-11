package ro.scoalainformala.domain;

import java.util.Objects;

public class UnicellularOrganism extends Microorganism {
    private boolean hasNucleus;

    public UnicellularOrganism(String name, String scientificClassification,String physicalRequirement, boolean hasNucleus) {
        super(name, scientificClassification, physicalRequirement);
        this.hasNucleus = hasNucleus;
    }

    public boolean getHasNucleus() {
        return hasNucleus;
    }

    public void setHasNucleus(boolean hasNucleus) {
        this.hasNucleus = hasNucleus;
    }


    @Override
    public String eat() {
        return getName() + " feeds through phagocytosis.";
    }

    @Override
    public String reproduce() {
        return getName() + " reproduces through cell division (binary fission).";
    }


    public String toString() {
        String nucleusPossession = hasNucleus ? "Has a nucleus" : "Does not have a nucleus";
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Physical Requirement: " + getPhysicalRequirement() + "Nucleus: " + nucleusPossession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnicellularOrganism org = (UnicellularOrganism) o;
        return hasNucleus == org.hasNucleus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHasNucleus());
    }
}