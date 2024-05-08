public enum DrinksMachine {
coffee, tea,  lemonade, moxito, water, coca_cola;

    public static DrinksMachine getFromString(String s) {
          for (DrinksMachine i: DrinksMachine.values()){
              if (i.name().equals(s)){
                  return i;
              }
          }
          return null;
    }
}
