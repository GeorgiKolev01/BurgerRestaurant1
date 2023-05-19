public abstract class RestaurantFactory {
    public abstract RestaurantBurger createBurger(String burgerName);

    public RestaurantBurger produceBurger(String burgerName) {
        RestaurantBurger burger = createBurger(burgerName);
        burger.prepare();
        return burger;
    }
}
