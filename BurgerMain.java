public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("sesame", "beef", "cheddar", "lettuce", "traditional");
        Burger dietBurger = new Burger("whole grain", "chicken", "mozzarella", "arugula");
        Burger doubleMeatBurger = new Burger("brioche", "beef", "gouda", "tomato", "garlic", true);
    }
}
