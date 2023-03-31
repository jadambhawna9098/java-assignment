//W.A.P to check whether given number is even or odd Without using % operator. 

import java.util.Scanner;
class Main{
   public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int a= sc.nextInt();
	
	if((a/2)*2==a){
	System.out.println("Even");
	}
	else{
	System.out.println("Odd");
	}
	
	}
	
          }
