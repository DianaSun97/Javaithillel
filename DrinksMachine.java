public enum DrinksMachine {
coffee(50), tea(18),  lemonade(20), moxito(12), water(10), coca_cola(33);
private int price;
DrinksMachine(int  price){
    this.price = price;

}
public int getPrice(){
    return price;
    }
    public static DrinksMachine getFromString(String s) {
          for (DrinksMachine i: DrinksMachine.values()){
              if (i.name().equals(s)){
                  return i;
              }
          }
          return null;
    }
}
