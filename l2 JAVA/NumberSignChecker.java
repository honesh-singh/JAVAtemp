import java.util.Scanner;
public class NumberSignChecker{
    public static void main(String []ard){
        //take user input in num variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :-");
        int num =sc.nextInt();
         // condition check for if num is Zero
        if(num==0){
         System.out.println("Number is Zero");
        }
        // condition check for if number is positive
        else if(num>0){
            System.out.println("Number is Positive");
        }
        // if number is not positive or zero, then it must be negative
        else {
            System.out.println("Number is Negative");
        }
        

    }
}