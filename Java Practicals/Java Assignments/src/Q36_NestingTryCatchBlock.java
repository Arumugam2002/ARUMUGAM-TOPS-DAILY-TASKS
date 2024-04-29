/* W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
block        */ 



import java.util.Scanner;

public class Q36_NestingTryCatchBlock 
{
    public static void main(String[] args) 	
    {
        Scanner scanner = new Scanner(System.in);
        
        int[] a = new int[5];
        
        try 
        {
            System.out.print("Enter the index : ");
            int index = scanner.nextInt();
            
            System.out.print("Enter the divisor : ");
            int divisor = scanner.nextInt();
            
            
            a[index] = 30 / divisor; 
            
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: You are trying to access an index beyond the array size.");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught ArithmeticException: Attempted to divide by zero.");
        } 
        catch (Exception e) 
        {
            System.out.println("Caught an unexpected exception: " + e.getMessage());
        }
       
    }
}

