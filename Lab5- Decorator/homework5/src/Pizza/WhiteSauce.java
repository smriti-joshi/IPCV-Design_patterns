package Pizza;

public class WhiteSauce extends Decorator {
        static int price = 200;
        public WhiteSauce(PizzaBase c){
            super(c);
        }
        public void draw()
        {
            component.draw();
            System.out.println("White Sauce");
        }

        @Override
        public int calPrice() {
            int temp = component.calPrice();
            return temp+this.price;
        }
}
