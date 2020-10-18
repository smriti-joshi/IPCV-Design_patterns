package Pizza;

public class Garlic extends Decorator {
    static int price = 100;
    public Garlic(PizzaBase c){
        super(c);
    }
    public void draw()
    {
        component.draw();
        System.out.println("Garlic");
    }

    @Override
    public int calPrice() {
        int temp = component.calPrice();
        return temp+this.price;
    }
}
