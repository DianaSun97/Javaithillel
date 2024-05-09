public enum Drinks {
    COFFEE(50), TEA(18),  LEMONADE(20), MOJITO(12), MINERAL_WATER(10), COCA_COLA(33), WRONG_DRINK(0);

    private final int price;

    public int getPrice() { return price; }

    Drinks (int price) {
        this.price = price;
    }
}
