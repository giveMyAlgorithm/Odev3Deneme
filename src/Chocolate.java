import java.util.Objects;

public class Chocolate implements IProduct {

    public static final  double DEFAULT_COST=4;
    public static final double  DEFAULT_CAPACITY=1;
    private double cost;
    private double capacity;
    public Chocolate() {
        this(DEFAULT_COST,DEFAULT_CAPACITY);
    }

    public Chocolate(double cost) {
        this(cost,DEFAULT_CAPACITY);
    }

    public Chocolate(double cost, double capacity) {
        this.cost = cost;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double newCost) {
        this.cost=cost;
    }

    @Override
    public boolean isCountable() {
        return true;
    }

    @Override
    public boolean isDifferent(IDifferent other) {
        return getClass()!=other.getClass();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chocolate chocolate = (Chocolate) o;
        return Double.compare(chocolate.cost, cost) == 0 &&
                Double.compare(chocolate.capacity, capacity) == 0;
    }


}
