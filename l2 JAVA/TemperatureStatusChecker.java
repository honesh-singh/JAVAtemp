import java.util.Scanner;
public class TemperatureStatusChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int temperature =sc.nextInt();

        if(temperature >0){
            System.out.println("Freezing");
        }
        else if(temperature<=15){
            System.out.println("cold");
        }
        else if(temperature<=25){
            System.out.println("Pleasant");
        }
        else if(temperature<=35){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot");
        }

    }
    
}
