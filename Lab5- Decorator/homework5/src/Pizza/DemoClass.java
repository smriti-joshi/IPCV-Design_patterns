package Pizza;

public class DemoClass {
    public static void main(String[] args) {
        int finpricePizza1 ;
        int finpricePizza2 ;
       PizzaBase pizza1 = new DeepDish("l");
       pizza1 = new Garlic(pizza1);
       pizza1= new Mozarella(pizza1);
       pizza1.draw();
       finpricePizza1  = pizza1.calPrice();
       System.out.println("Price:"+finpricePizza1 +" forints");

       PizzaBase pizza2 = new NewYork("s");
       pizza2 = new WhiteSauce(new Basil(new Mozarella(pizza2)));
       pizza2.draw();
       finpricePizza2 = pizza2.calPrice();
       System.out.println("Price:"+finpricePizza2+" forints");

    }
}
