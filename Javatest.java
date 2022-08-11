import java.util.*;
public class DecimalToHexExample2{    
    public static String toHex(int decimal){    
         int rem;  
         String hex="";   
         char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        while(decimal>0)  
         {  
           rem=decimal%16;   
           hex=hexchars[rem]+hex;   
           decimal=decimal/16;  
         }  
        return hex;  
    }    
    public static void main(String args[]){   
        Scanner input = new Scanner(System.in);		// Create new Scanner object

		// Prompt the user to enter a number between 0 and 1000.
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
        System.out.println("Hexadecimal of "+number+" is:"+toHex(number)); 
    }
    
}      