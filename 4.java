//WAP to check wheather number is even or odd

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
            String s = (num%2==0)?"Even":"Odd";
        
            System.out.println(s);
        }
    }
