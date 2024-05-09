import java.util.List;

public class CalcMain {
    public static void main(String[] args) {
        DrinksMachine machine = new DrinksMachine();
        List<Drinks> order = machine.askClient();
        int totalPrice = machine.calculateTotalPrice(order);
        System.out.println("You must pay $" + totalPrice + "!");
        machine.prepareDrinks(order);
    }

}
