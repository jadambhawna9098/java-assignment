//Write a Java program to calculate profit or loss. 

import java.util.Scanner;
class Main{
   public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Cost Price");
	double cp= sc.nextInt();
	
	System.out.println("Enter the Selling Price");
	double sp= sc.nextInt();
	
	if(cp - sp>0){
	System.out.println("Loss");
	}
	else{
	System.out.println("Profit");
	}
	
	  }
	     }
