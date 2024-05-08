import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        System.out.println("You can order multiple drinks");
        System.out.println("You can chose some drinks coffee, tea,  lemonade, moxito, water, coca_cola ");
        System.out.println("How many drinks you want chose");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int n = scan.nextInt();
        DrinksMachine s[] =new DrinksMachine[n];
        int number[] = new int[n];
        for (int i=0; i<n; i++){
            while (true){
                System.out.println("Your chose");
                String choice = scan2.nextLine();
                DrinksMachine dm = DrinksMachine.getFromString(choice);
                if (dm == null){
                    System.out.println("Error");
                    }else{
                    s[i]=dm;
                    break;
                }
            }
            System.out.println("How match");
            number[i]= scan.nextInt();
        }
    }
    public static final int  price_coffee = 50;
    public static final int price_tea = 25;
    public static final int price_limonade = 15;
    public static final int price_moxito = 45;
    public static final int price_water = 10;
    public static final int coca_cola = 18;

    public static  int totalPrice (DrinksMachine s[], int number []){
        int totalPrice = 0;
        for(int i =0; i<s.length; i++){
            switch (s[i]){
                case coffee:
                    totalPrice += price_coffee*number[i];
                    break;
            }
        }
        return totalPrice;
    }
}
