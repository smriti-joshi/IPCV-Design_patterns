package Pizza;

public class TomatoSauce extends Decorator{
    static int price = 100;
    public TomatoSauce(PizzaBase c){
        super(c);
    }
    public void draw()
    {
        component.draw();
        System.out.println("Tomato Sauce");
    }

    @Override
    public int calPrice() {
        int temp = component.calPrice();
        return temp+ this.price;
    }
}
