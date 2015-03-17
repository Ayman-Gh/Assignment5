import java.util.Scanner; 

public class FindPI 

{
    public static void main(String[]args) 
    {
    Scanner Reader = new Scanner(System.in); 
    
    int input; 
    
    System.out.print("Enter the number of iterations:");
    input = Reader.nextInt(); 
    
    double sum = 0; 
    
    for (int i = 1; i <= input; i++) {
   
    double numToAdd = (1.0 / ((i * 2) - 1));
         
    
     if (i%2 > 0) 
     sum = sum + numToAdd; 
     else 
     sum = sum - numToAdd;
    
     System.out.println("PI/4 is equal to " + sum);
     
}
  }  
}