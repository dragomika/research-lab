package ro.scoalainformala.domain;

import java.util.Objects;

public class MulticellularOrganism extends Organism {
    private boolean cellCount;

    public MulticellularOrganism(String name, String scientificClassification, boolean cellCount) {
        super(name, scientificClassification);
        this.cellCount = cellCount;
    }

    public boolean getCellCount() {
        return cellCount;
    }

    public void setCellCount(boolean cellCount) {
        this.cellCount = cellCount;
    }


    @Override
    public String eat() {
        return getName() + " can be heterotroph or autotroph.";
    }

    @Override
    public String reproduce() {
        return getName() + " can reproduce asexually or sexually.";
    }

    @Override
    public String toString() {
        String multipleCells = cellCount ? "Has multiple cells" : "Has just one cell";
        return super.toString() + "Organism: " + getName() + "\n" + "Eating behavior: " + eat() + "\n" + "Reproduction behavior: " + reproduce() + "\n" + "Scientific Classification: " + getScientificClassification() + "\n" + "Cell Count: " + multipleCells;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MulticellularOrganism org = (MulticellularOrganism) o;
        return cellCount == org.cellCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCellCount());
    }

}
