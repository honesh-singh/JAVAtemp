import java.util.Scanner;
public class LeapYear {
    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);   
     //take year user input
     System.out.println("-------------------------Leap Year Range Validator------------------------------------");
     System.out.print("Enter year:-");
     int year =sc.nextInt();
     // check if it is within 1900 to 2100
     if(year>1899 && year<2101){
        // condition to check leap year
        if((year %4==0 && year % 100 !=0)||(year %400==0)){
            System.out.println("yes it's a leap year");
        }
        else{
            System.out.println("it's not a leap year");
        }

     }
     else{
        System.out.println("invalid year entered");
     }
System.out.println("----------------------End of the program -------------------------");
    }

}
