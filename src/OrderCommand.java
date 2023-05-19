public class OrderCommand implements Command{
    private  Cooker cooker;
    private String type;

    public OrderCommand(Cooker cooker, String type){
        this.cooker = cooker;
        this.type = type;
    }
    @Override
    public void order() {
        cooker.CookBurger(type);
    }
}
