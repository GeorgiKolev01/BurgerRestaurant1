public class RestaurantMain {
    public static void main(String[] args) {
        String kingsBurger = "кралски";
        String classicBurger = "класически";
        String vegetarianBurger = "вегетариански";

        String ketchup = "кетчуп";
        String garlicSauce = "чеснов сос";

        //Singleton
        Restaurant restaurant1 = Restaurant.getInstance();
        restaurant1.arrive("Бургери на корем");

        //Command
        Cooker cooker = new Cooker();
        Cashier cashier = new Cashier();
        Command cookClassicBurger = new OrderCommand(cooker, classicBurger);
        cashier.setCommand(cookClassicBurger);
        cashier.takeOrder();

        //Factory
        //RestaurantFactory burgerFactory = new BurgerFactory();
        //RestaurantBurger restaurantBurger = burgerFactory.produceBurger(classicBurger);

        //Decorator
        Burger classicBurgerDecoration = new ClassicBurger();
        classicBurgerDecoration = new SauceDecorator(classicBurgerDecoration, ketchup);
        classicBurgerDecoration.create();


    }

}
