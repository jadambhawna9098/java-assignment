//W.A.P to check the sign of given number


import java.util.Scanner;
class Main{
   public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	char operator;
	System.out.println("Choose a Sign: +, -, *, or /");
	operator = sc.next().charAt(0);
	
	switch(operator){
	case '+':
	System.out.println("Positive Sign");
	break;
	
	case '-':
	System.out.println("Negative Sign");
	break;
	
	case '*':
	System.out.println("Multiplication Sign");
	break;
	
	case '/':
	System.out.println("Division Sign");
	break;
	
	default:
	System.out.println("Invalid Sign");
	break;
	
	}
	  }
	    }
