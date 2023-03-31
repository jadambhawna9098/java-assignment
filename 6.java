//WAP to exchange value to two variable without third variable

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.print("Enter x number: ");
            int x = sc.nextInt();
            System.out.print("Enter Y number: ");
            int y = sc.nextInt();
            
            x = x + y;   
            y = x - y;   
            x = x - y;   
            
            System.out.println("Value of X :"+x);
            System.out.println("Value of Y :"+y);
        }
    }
