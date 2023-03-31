//WAP to find greater among three number

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter First number: ");
            int a = sc.nextInt();
            System.out.println("Enter Second number: ");
            int b = sc.nextInt();
            System.out.println("Enter Second number: ");
            int c = sc.nextInt();
            int d=0;
            
            c = a>b ? a : b; 
            d = d>c ? d : c;    
            
            System.out.println("Greater Number :"+d);
        }
    }
