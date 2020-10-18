package Pizza;

public class Neapolitan implements PizzaBase {
    int price;
    String typePizza;
    public Neapolitan(String type)
    {
        if(type == "l")
        {
            price = 1000;
            typePizza = "Large";
        }
        if(type == "m")
        {
            price = 700;
            typePizza = "Medium";
        }
        if(type == "s")
        {
            price = 500;
            typePizza = "Small";
        }
    }
    @Override
    public void draw() {
        System.out.println("\nNeapolitan\n\n"+"Size:"+this.getType());
    }

    public String getType()
    {
        return typePizza;
    }

    @Override
    public int calPrice() {
        return price;
    }

}