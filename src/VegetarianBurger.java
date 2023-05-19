public class VegetarianBurger extends RestaurantBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("В процес на приготвяне е вегератиански бургер.");
    }

    @Override
    public void create() {
        System.out.printf("Вегетарианският бургер със ");
    }
}
