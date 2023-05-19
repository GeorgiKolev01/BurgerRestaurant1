public class Cooker {
    public void CookBurger(String type){
        System.out.println("Готвачът започва приготвя "+ type + " бургер.");
        RestaurantFactory burgerFactory = new BurgerFactory();
        RestaurantBurger restaurantBurger = burgerFactory.produceBurger(type);
    }

}
