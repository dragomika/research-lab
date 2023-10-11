package ro.scoalainformala.domain;

import java.util.Objects;

public class Algae extends Microorganism {
    private String waterType;
    private String pigmentCategory;

    public Algae(String name, String scientificClassification, String physicalRequirement, String waterType, String pigmentCategory) {
        super(name, scientificClassification, physicalRequirement);

        this.waterType = waterType;
        this.pigmentCategory = pigmentCategory;
    }

    public String getWaterType() {
        return waterType;
    }
    public String getPigmentCategory() {
        return pigmentCategory;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
    public void setPigmentCategory(String pigmentCategory) {
        this.pigmentCategory = pigmentCategory;
    }

    @Override
    public String eat() {
        return getName() + " photosynthesizes.";
    }

    @Override
    public String reproduce() {
        return getName() + " releases spores for reproduction.";
    }

    @Override
    public String toString() {
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Physical Requirement" + getPhysicalRequirement() + "Water Type: " + waterType + "Pigment Category: " + pigmentCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Algae org = (Algae) o;
        return waterType.equals(org.waterType) && pigmentCategory.equals(org.pigmentCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWaterType(), getPigmentCategory());
    }
}
