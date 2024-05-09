import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        System.out.println("You can order multiple drinks");
        System.out.println("You can chose some drinks coffee, tea,  lemonade, moxito, water, coca_cola");
        System.out.println("How many drinks you want chose");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int n = scan.nextInt();
        DrinksMachine s[] = new DrinksMachine[n];
        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.println("What drink you want ?");
                String choice = scan2.nextLine();
                DrinksMachine dm = DrinksMachine.getFromString(choice);
                if (dm == null) {
                    System.out.println("Error");
                } else {
                    s[i] = dm;
                    break;
                }
            }
            System.out.println("How match");
            number[i] = scan.nextInt();

        }

        System.out.println( "Count drinks "+getCount(number)+ " Price order "+totalPrice(s,number));

    }

    public static int totalPrice(DrinksMachine s[], int number[]) {
        int totalPrice = 0;
        for (int i = 0; i < s.length; i++) {
            totalPrice += s[i].getPrice() * number[i];
        }
        return totalPrice;
    }

    public static int getCount(int[] number) {
        int count = 0;
        for (int j : number) {
            count += j;
        }
        return count;
    }
}
