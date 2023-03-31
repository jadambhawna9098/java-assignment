//WAP to check wheater number is positive or negative

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the Number: ");
            int num= sc.nextInt();
            
            if(num>0){
                System.out.println("Positive :");
            }else{
                System.out.println("Negative :");
            }
        }
    } 
