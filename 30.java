// WAP to exchange value of two variable without using third variable and arithmetic operator


import java.util.Scanner;
class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value :");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Value :");
		int b=sc.nextInt();
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
		
		}
		   }
