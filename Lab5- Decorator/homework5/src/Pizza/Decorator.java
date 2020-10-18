package Pizza;

public abstract  class Decorator implements PizzaBase {
    PizzaBase component;
    public Decorator(PizzaBase c)
    {
        component = c;
    }
}
