//W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 

import java.util.Scanner;
class Main{
   public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Length");
	int l= sc.nextInt();
	
	System.out.println("Enter the Breith");
	int b= sc.nextInt();
	
	System.out.println("Enter the Height");
	int h= sc.nextInt();
	
	if(l==b && l==h){
	System.out.println("Equilateral Triangle");
	}
	else if((l==b || l==h) || (b==h)){
	System.out.println("Isosceles Triangle");
	}
	else{
	System.out.println("Scalene Triangle");
	}
	
	  }
	    }
