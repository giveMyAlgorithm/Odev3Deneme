public interface IIngredient extends ICountable, IDifferent {

    /**
     * @return cost of the goods
     */
    public double getCost();


    /**
     * @param cost
     * changes the cost
     */
    public void setCost(double cost);

}
