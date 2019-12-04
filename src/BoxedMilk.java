import java.util.Objects;

public class BoxedMilk implements IProduct {

    public static final  double DEFAULT_COST=1;
    public static final double  DEFAULT_CAPACITY=0.5;
    private double cost;
    private double capacity;

    public BoxedMilk() {
    }

    public BoxedMilk(double cost) {
        this.cost = cost;
    }

    public BoxedMilk(double cost, double capacity) {
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
    public boolean isCountable() {
        return true;
    }

    @Override
    public boolean isDifferent(IDifferent other) {
        return getClass()!=other.getClass();
    }

    @Override
    public String toString() {
        return "BoxedMilk{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxedMilk boxedMilk = (BoxedMilk) o;
        return Double.compare(boxedMilk.cost, cost) == 0 &&
                Double.compare(boxedMilk.capacity, capacity) == 0;
    }


}
