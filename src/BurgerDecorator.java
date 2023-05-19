public abstract class BurgerDecorator implements Burger{
    protected Burger saucedBurger;

    public BurgerDecorator(Burger saucedBurger) {
        super();
        this.saucedBurger = saucedBurger;
    }

    @Override
    public void create() {
        this.saucedBurger.create();
    }
}
