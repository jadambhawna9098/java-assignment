//WAP to calculate the percentage of students

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the First Number");
            int a=sc.nextInt();
            System.out.println("Enter the Second Number");
            int b=sc.nextInt();
            System.out.println("Enter the Third Number");
            int c=sc.nextInt();
            System.out.println("Enter the Fourth Number");
            int d=sc.nextInt();
            System.out.println("Enter the Fifth Number");
            int e=sc.nextInt();
            int total = a+b+c+d+e;
            float per = total/5;
            System.out.println("Total Marks:"+total);
            System.out.println("Percentage:"+per);
        }
    }  
