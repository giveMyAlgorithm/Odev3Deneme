import java.util.Objects;

public class Yogurt implements IProduct{
    public static final  double DEFAULT_COST=2;
    public static final double  DEFAULT_CAPACITY=2;
    private double cost;
    private double capacity;

    public Yogurt() {
        this(DEFAULT_COST,DEFAULT_CAPACITY);
    }

    public Yogurt(double cost) {
        this(cost,DEFAULT_CAPACITY);
    }

    public Yogurt(double cost, double capacity) {
        this.cost = cost;
        this.capacity = capacity;
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
    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Yogurt";
    }

    @Override
    public boolean isCountable() {
        return true;
    }

    @Override
    public boolean isDifferent(IDifferent other) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yogurt yogurt = (Yogurt) o;
        return Double.compare(yogurt.cost, cost) == 0 &&
                Double.compare(yogurt.capacity, capacity) == 0;
    }


}

