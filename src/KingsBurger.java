public class KingsBurger extends RestaurantBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("В процес на приготвяне е кралски бургер.");
    }

    @Override
    public void create() {
        System.out.printf("Кралският бургер със ");
    }
}
