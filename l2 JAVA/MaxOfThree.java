import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int num2 = sc.nextInt();
        System.out.print("Enter Third Number:- ");
        int num3 = sc.nextInt();
        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Maximum in three numbers is:- " + max);
    }
}
