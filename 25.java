//Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.Calculate percentage and grade . 


import java.util.Scanner;
class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Physics Marks :");
		int phy=sc.nextInt();
		
		System.out.println("Enter Chemistry Marks :");
		int che=sc.nextInt();
		
		System.out.println("Enter Biology Marks :");
		int bio=sc.nextInt();
		
		System.out.println("Enter Mathematics Marks :");
		int math=sc.nextInt();
		
		System.out.println("Enter Computer Marks :");
		int com=sc.nextInt();
		
		int total;
		total = phy + che + bio + math + com;
		
		float per;
		per = total/5;
		
		if(per >= 90){
		System.out.println("Grade A");
		}
		else if(per >= 80){
		System.out.println("Grade B");
		}
		else if(per >= 70){
		System.out.println("Grade C");
		}
		else if(per >= 60){
		System.out.println("Grade D");
		}
		else if(per >= 40){
		System.out.println("Grade E");
		}
		else{
		System.out.println("Grade F");
		}
		
		 }
		 
		  }
		
