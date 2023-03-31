//Write a Java program to input basic salary of an employee and calculate its Gross salary  


import java.util.Scanner;
class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary :");
		int bs=sc.nextInt();
		
		float hra,da,gs;
		
		if(bs <= 10000){
		gs = ((bs * 0.2f) + (bs * 0.8f)+bs);
		System.out.println("Gross Salary :"+gs);
		}
		else if(bs <= 20000){
		gs = ((bs * 0.25f) + (bs * 0.9f)+bs);
		System.out.println("Gross Salary :"+gs);
		}
		else if(bs > 20000){
		gs = ((bs * 0.3f) + (bs * 0.95f)+bs);
		System.out.println("Gross Salary :"+gs);
		}
		else{
		}
		
		
		
		  }
		  
		    }
