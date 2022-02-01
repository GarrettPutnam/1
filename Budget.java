import java.util.Scanner;
public class Budget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Income\t\t" + "$" );
        int Income = sc.nextInt();

        double Spend = (Income * .3);
        System.out.println("Spend\t\t" + "$" + Spend);

        double Save = (Income * .4);
        System.out.println("Save\t\t" + "$" + Save);

        double Invest = (Income * .3);
        System.out.println("Invest\t\t" + "$" + Invest);

    }
}
