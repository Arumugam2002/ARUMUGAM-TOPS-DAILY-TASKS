import java.util.Scanner;

public class Q10_ComputeValueNNN {
    public static void main(String[] args) 
    {
    	
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter  number: ");
        int n = scanner.nextInt();  
        
        
        String nStr = Integer.toString(n);
        String nnStr = nStr + nStr;  
        String nnnStr = nnStr + nStr; 
        
       
        int nn = Integer.parseInt(nnStr);
        int nnn = Integer.parseInt(nnnStr);
        
      
        int result = n + nn + nnn;
        
        
        System.out.println("Result: " + n + " + " + nn + " + " + nnn + " = " + result);
        
        scanner.close();
    }
}
