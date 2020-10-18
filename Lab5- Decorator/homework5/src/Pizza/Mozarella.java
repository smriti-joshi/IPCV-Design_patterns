package Pizza;

public class Mozarella extends Decorator {
    static int price = 500;
    public Mozarella(PizzaBase c){
        super(c);
    }
    public void draw()
    {
        component.draw();
        System.out.println("Mozarella");
    }

    @Override
    public int calPrice() {
        int temp = component.calPrice();
        return temp+this.price;
    }
}
