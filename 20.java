//Write a Java program to check whether a number is divisible by 5 and 11 or not. 


import java.util.Scanner;
class Main{
   public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int a= sc.nextInt();
	
	if(a%5==0 && a%11==0){
	System.out.println("Divisior :");
	}
	else{
	System.out.println("Not Divisior :");
	}
	
	   }
	       }
