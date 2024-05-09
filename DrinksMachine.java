import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DrinksMachine {

    public List<Drinks> askClient() {
        System.out.println("You can order multiple drinks");
        System.out.println("You can chose several drinks: coffee, tea, lemonade, mojito, mineral_water, coca_cola");
        System.out.println("To finish type stop");
        Scanner sc = new Scanner(System.in);
        List<Drinks> drinks = new ArrayList<>();
        String userInput = sc.nextLine();
        while (!Objects.equals(userInput.toLowerCase(), "stop")) {
            drinks.add(getFromString(userInput.toUpperCase()));
            userInput = sc.nextLine();
        }
        sc.close();
        return drinks;
    }

    public int calculateTotalPrice(List<Drinks> order) {
        int totalPrice = 0;
        for (Drinks drink : order) {
            totalPrice += drink != null ? drink.getPrice() : 0;
        }
        return totalPrice;
    }

    public void prepareDrinks(List<Drinks> drinks) {
        for (Drinks drink : drinks) {
            switch (drink) {
                case COFFEE:
                    prepareCoffee();
                    break;
                case TEA:
                    prepareTea();
                    break;
                case LEMONADE:
                    prepareLemonade();
                    break;
                case MOJITO:
                    prepareMojito();
                    break;
                case MINERAL_WATER:
                    prepareMineralWater();
                    break;
                case COCA_COLA:
                    prepareCola();
                    break;
                default:
                    prepareNothing(drink);
                    break;
            }
        }
    }

    private void prepareCoffee() {
        System.out.println("Preparing your coffee...");
    }

    private void prepareTea() {
        System.out.println("Preparing your tea...");
    }

    private void prepareLemonade() {
        System.out.println("Preparing your lemonade...");
    }

    private void prepareMojito() {
        System.out.println("Preparing your mojito...");
    }

    private void prepareMineralWater() {
        System.out.println("Preparing your mineral water...");
    }

    private void prepareCola() {
        System.out.println("Preparing your Coca-Cola...");
    }

    private void prepareNothing(Drinks wrongDrink) {
        System.out.println("Cannot prepare " + wrongDrink.name().toLowerCase());
    }

    private Drinks getFromString(String s) {
          for (Drinks drink: Drinks.values()){
              if (drink.name().equals(s)){
                  return drink;
              }
          }
          return Drinks.WRONG_DRINK;
    }
}
