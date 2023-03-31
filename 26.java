//Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180.


import java.util.Scanner;
class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Side :");
		int a1=sc.nextInt();
		
		System.out.println("Enter Second Side :");
		int a2=sc.nextInt();
		
		System.out.println("Enter Third Side :");
		int a3=sc.nextInt(); 
		
		int sum;
		sum = a1 + a2 + a3;
		
		if(sum==180){
		System.out.println("Valid Triangle");
		}
		else{
		System.out.println("Invalid Triangle");
		} 
		 
		  }
		  
		    }
		
