import java.util.Objects;

public class Yeast implements IIngredient {
    private static final double DEFAULT_COST=5;
    private double cost;
    public Yeast() {
        this(DEFAULT_COST);
    }

    public Yeast(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;

    }

    @Override
    public boolean isCountable() {
        return false;
    }

    @Override
    public boolean isDifferent(IDifferent other) {
        return getClass()!=other.getClass();
    }

    @Override
    public String       toString() {
        return "Yeast{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yeast yeast = (Yeast) o;
        return Double.compare(yeast.cost, cost) == 0;
    }


}
