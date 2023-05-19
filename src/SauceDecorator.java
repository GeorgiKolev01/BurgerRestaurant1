public class SauceDecorator extends BurgerDecorator{
    private String sauce;
    public SauceDecorator(Burger saucedBurger, String sauce) {
        super(saucedBurger);
        this.sauce = sauce;
    }
    @Override
    public void create() {
        super.create();
        this.addSauce();
    }

    private void addSauce() {
        System.out.println(this.sauce + " е готов!");
    }
}
