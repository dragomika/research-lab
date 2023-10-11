package ro.scoalainformala.domain;

import java.util.Objects;

public class Plant extends MulticellularOrganism {
    private String habitat;
    private String soilType;
    private int sunlightRequired;

    public Plant(String name, String scientificClassification, boolean cellCount, String habitat, String soilType, int sunlightRequired) {
        super(name, scientificClassification, cellCount);
        this.habitat = habitat;
        this.soilType = soilType;
        this.sunlightRequired = sunlightRequired;

    }

    public String getHabitat() {
        return habitat;
    }

    public String getSoilType() {
        return soilType;
    }

    public int getSunlightRequired() {
        return sunlightRequired;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String eat() {
        return getName() + " photosynthesizes.";
    }

    @Override
    public String reproduce() {
        return getName() + " produces seeds or spores.";
    }

    @Override
    public String toString() {
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Cell Count: " + getCellCount() + "\n" + "Habitat: " + getHabitat() + "\n" + "Soil Type: " + getSoilType() + "\n" + "Sunlight Required (hours per day): " + getSunlightRequired();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant org = (Plant) o;
        return habitat.equals(org.habitat) && soilType.equals(org.soilType) && sunlightRequired == org.sunlightRequired;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabitat(), getSoilType(), getSunlightRequired());
    }
}
