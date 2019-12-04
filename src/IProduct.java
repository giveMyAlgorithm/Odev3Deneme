public interface IProduct extends IDifferent,ICountable {
    /**
     * @return capacity  of the product
     */
    public double getCapacity();
    /**
     * @return cost of the product
     */
    public double getCost();

    /**
     * @param newCost
     * changes the cost to the  given newCost
     */
    public void setCost(double newCost);
}
