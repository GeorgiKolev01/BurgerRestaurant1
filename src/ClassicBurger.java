public class ClassicBurger extends RestaurantBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("В процес на приготвяне е класически бургер.");
    }

    @Override
    public void create() {
        System.out.printf("Класическият бургер със ");
    }
}
