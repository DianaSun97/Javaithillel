public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    // Constructor for a regular burger
    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Regular burger: " + this);
    }

    // Constructor for a diet burger (without mayonnaise)
    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens, null);
        System.out.println("Diet burger: " + this);
    }

    // Constructor for a burger with double meat
    public Burger(String bun, String meat, String cheese, String greens, String mayo, boolean doubleMeat) {
        this(bun, doubleMeat ? meat + " (double)" : meat, cheese, greens, mayo);
        System.out.println("Double meat burger: " + this);
    }

    @Override
    public String toString() {
        return String.format("Bun: %s, Meat: %s, Cheese: %s, Greens: %s, Mayo: %s", bun, meat, cheese, greens, mayo != null ? mayo : "none");
    }
}
