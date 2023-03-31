//W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 

import java.util.Scanner;
class Main{
   public static void main(String[] args){
       
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Choice First and Second ");
	int ch=sc.nextInt();
	
	System.out.println("Enter the First Number");
	float F=sc.nextFloat();
	float c,d;
	
	switch(ch){
	case 1:
	c = (F-32)*0.5f;
	System.out.println("Fahrenheit :"+c);
	break;
	
	case 2:
	d = (F+32)*1.8f;
	System.out.println("Celsius :"+d);
	break;
	
	}
	  }
	    }
	
	
	
	
        
       
