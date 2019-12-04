public class testMain {
    public static void main(String[] args) {

        IProduct chocolate= new Chocolate();
        IProduct boxedMilk= new BoxedMilk();
        IProduct yogurt= new Yogurt();

        IIngredient cacao=new Cacao();
        IIngredient cream=new Cream();
        System.out.println(chocolate.isDifferent(cacao));

    }
}
