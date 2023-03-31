//Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 


import java.util.Scanner;
class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		float a=sc.nextInt();
		
		float p,q,res;
		res=0;
		
		if(a<=50){
		p = a*0.50f;
		q = ((a/100)*20);
		res = p + q;
		}
		
		if(a>50 && a<=100){
		p = a*0.75f;
		q = ((a/100)*20);
		res = p + q;
		}
		
		if(a>100 && a<=150){
		p = a*1.20f;
		q = ((a/100)*20);
		res = p + q;
		}
		
		if(a>150 && a<=250){
		p = a*1.50f;
		q = ((a/100)*20);
		res = p + q;
		}
		
		System.out.println("Result :"+res);
		
		  }
		     }
		
		
