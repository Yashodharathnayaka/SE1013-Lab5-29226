
 
package exception1;
import java.util.Scanner;
public class Exception1 {

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter first number:");
        x=sc.nextInt();
         System.out.println("Enter second number:");
        y=sc.nextInt();
        
        
        try
        {
            z=x/y;
            System.out.println("Answer:"+z);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error:We cant divide by zero");
        }
        System.out.println("Stil going on!");
            
            
        
    }
    
}
