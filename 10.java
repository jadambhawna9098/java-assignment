//Find even odd using switch case 

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            
            System.out.println("Enter the Number: ");
            int num= sc.nextInt();
            
            switch(num%2){
            case 0:
            System.out.println("Even number");
            
            break;
            
            case 1:
            System.out.println("Odd number");
        }
    } 
 } 
