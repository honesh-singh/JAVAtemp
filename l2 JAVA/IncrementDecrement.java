 public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 12;
        int b = 60;

        System.out.println("before ++ && -- values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //postincement
        System.out.println("Post increment:");
        System.out.println(" while increment a= " + (a++) +" after increment a="+ (a));  
        System.out.println(" while increment b= " + (b++) +" after increment a="+ (b)); 
       
        // preincrement
        System.out.println("Pre increment: ");
        System.out.println(" while pre increment a= " + (++a) +" after pre increment a="+ (a));  
        System.out.println(" while pre increment b= " + (++b) +" after pre increment a="+ (b)); 

        // Postdecrement
        System.out.println("Post decrement: ");
        System.out.println(" while dcrement a= " + (a--) +" after dcrement a="+ (a));  
        System.out.println(" while dcrement b= " + (b--) +" after dcrement a="+ (b)); 

        // PrEdecrement
        System.out.println("Pre decrement: ");
       System.out.println(" while pre dec a= " + (--a) +" after a="+ (a));  
        System.out.println(" while pre dec b= " + (--b) +" after  a="+ (b)); 
    }
}
 
    

