//Print number between 1 to 5 in word format 

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            
            System.out.println("Enter the Number: ");
            int num= sc.nextInt();
            
            if(num==1){
                System.out.println("One");
            }else if(num==2){
                System.out.println("Two");
            }else if(num==3){
                System.out.println("Three");
            }else if(num==4){
                System.out.println("Four");
            }else{
                System.out.println("Five");
            }
          } 
        } 
