//W.A.P to check whether a charachter is an alphabet or not.

import java.util.Scanner;
class Main{
   public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	char ch;
	
	System.out.println("Enter the Number");
	ch=sc.next().charAt(0);
	
	if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
	System.out.println("Alphabet");
	}
	else{
	System.out.println("Not Alphabet");
	}
	
	  }
	    }
	
