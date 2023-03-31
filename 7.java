//WAP to find greater among two number

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter First number: ");
            int x = sc.nextInt();
            System.out.println("Enter Second number: ");
            int y = sc.nextInt();
            
            if(x>y){
                System.out.println("Greater :");    
            }else{
                System.out.println("Not Greater :");
            }
            
        }
    } 
