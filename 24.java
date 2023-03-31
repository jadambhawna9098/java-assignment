//Write a Java program to count total number of notes in given amount. 


import java.util.Scanner;
class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount :");
		int amount=sc.nextInt();
		
		int n2000,n500,n200,n100,n50,n20,n10,n5,n2,n1;

		n2000 = amount / 2000;
		amount = amount % 2000;

		n500 = amount / 500;
		amount = amount % 500;

		n200 = amount / 200;
		amount = amount % 200;

		n100 = amount / 100;
		amount = amount % 100;

		n50 = amount / 50;
		amount = amount % 50;

		n20 = amount / 20;
		amount = amount % 20;

		n10 = amount / 10;
		amount = amount % 10;

		n5 = amount / 5;
		amount = amount % 5;

		n2 = amount / 2;
		amount = amount % 2;

		n1 = amount / 1;
		amount = amount % 1;

		System.out.println("2000 Rupees : "+n2000);
		System.out.println("500 Rupees : "+n500);
		System.out.println("200 Rupees : "+n200);
		System.out.println("100 Rupees : "+n100);
		System.out.println("50 Rupees : "+n50);
		System.out.println("20 Rupees : "+n20);
		System.out.println("10 Rupees : "+n10);
		System.out.println("5 Rupees : "+n5);
		System.out.println("2 Rupees : "+n2);
		System.out.println("1 Rupees : "+n1);

		}

			}   
