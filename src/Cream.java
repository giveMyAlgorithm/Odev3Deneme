public class Cream implements IIngredient {

    private static final double DEFAULT_COST=0.25;
    private double cost;
    public Cream() {
        this(DEFAULT_COST);
    }

    public Cream(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost=cost;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cream cream = (Cream) o;
        return Double.compare(cream.cost, cost) == 0;
    }


    @Override
    public String toString() {
        return "Cream";
    }



}
