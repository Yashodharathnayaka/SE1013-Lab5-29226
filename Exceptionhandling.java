
package exceptionhandling;

public class Exceptionhandling {

    
    public static void main(String[] args)
    {
       int[] numbers = {1,2,3,4,5};
    
          try
          {
            int value= numbers[10];
             System.out.println("value= "+value);
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
              System.out.println("Array index is out of bounds");
          }
    }
    
}
