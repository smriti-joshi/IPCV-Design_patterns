package Pizza;

public class NewYork implements PizzaBase {
    int price;
    String typePizza;
    public NewYork(String type)
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
        System.out.println("\nNew York\n\n"+"Size:"+getType());
    }
    public int calPrice() {
        return price ;
    }
    public String getType()
    {
        return typePizza;
    }
}
