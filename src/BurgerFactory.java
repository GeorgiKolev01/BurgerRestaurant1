public class BurgerFactory extends RestaurantFactory {
    @Override
    public RestaurantBurger createBurger(String burgerName) {
        if (burgerName.equals(ConstantsBurgers.CLASSIC_BURGER)) {
            return new ClassicBurger();
        }
        if (burgerName.equals(ConstantsBurgers.KINGS_BURGER)) {
            return new KingsBurger();
        }
        if (burgerName.equals(ConstantsBurgers.VEGETARIAN_BURGER)) {
            return new VegetarianBurger();
        }
        System.out.println("нямаме такъв бургер: " + burgerName);
        return null;
    }
}
