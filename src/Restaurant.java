public class Restaurant {
    private static Restaurant instance;
    private Restaurant() {}
    public static Restaurant getInstance() {
        if(instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }
    public void arrive(String name) {
        System.out.println("Правим поръчка в ресторант за бургери на име - " + name + ".");
    }

}
