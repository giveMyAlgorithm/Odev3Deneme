public class Cacao implements IIngredient {

    private static final double DEFAULT_COST=1;
    private double cost;
    public Cacao() {
        this(DEFAULT_COST);
    }

    public Cacao(double cost) {
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
        Cacao cacao = (Cacao) o;
        return Double.compare(cacao.cost, cost) == 0;
    }


    @Override
    public String toString() {
        return "Cacao";
    }

}
