package ro.scoalainformala.domain;


import java.util.Objects;

public class Organism {
    private String name;
    private String scientificClassification;

    public Organism(String name, String scientificClassification) {
        this.name = name;
        this.scientificClassification = scientificClassification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificClassification() {
        return scientificClassification;
    }

    public void setScientificClassification(String scientificClassification) {
        this.scientificClassification = scientificClassification;
    }

    public String eat() {
        return " can be heterotroph or autotroph";
    };

    public String reproduce() {
        return getName() + " can lay eggs or birth offspring";
    };

    public String toString() {
        return "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organism organism = (Organism) o;
        return name.equals(organism.name) && scientificClassification.equals(organism.scientificClassification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScientificClassification());
    }
}
