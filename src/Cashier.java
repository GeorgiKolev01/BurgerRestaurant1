public class Cashier {
    private Command command;
    public  void setCommand(Command command){
        this.command = command;
    }
    public void takeOrder(){
        command.order();
    }
}
