import java.util.Scanner;
public class AgeCategoryClassifier{
    public static void main(String [] ard){
        Scanner sc = new Scanner(System.in);
        // take input form user
        System.out.print("enter age:-");
        byte age=sc.nextByte();

        // check conditions for child,teenager,adult,senior
        if(age<0){
            System.out.println("Invalid age entered");
        }
        else if(age==0){
            System.out.println("New born");
        }
        else if(age <13){
            System.out.println("Child");
        }
        else if(age <20){
            System.out.println("Teenage");
        }
        else if(age <36){
            System.out.println("Young Adult");
        }
        else if(age <61){
            System.out.println("Adult");
        }
        else{
           System.out.println("Senior Citizen");
        }
    }

}