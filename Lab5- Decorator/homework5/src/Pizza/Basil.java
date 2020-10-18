package Pizza;

public class Basil extends Decorator {
    static int price = 50;
    public Basil(PizzaBase c){
        super(c);
    }
    public void draw()
    {
        component.draw();
        System.out.println("Basil");
    }

    @Override
    public int calPrice() {
        int temp = component.calPrice();
        return temp+this.price;
    }
}
