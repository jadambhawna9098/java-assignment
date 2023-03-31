//WAP to find lowest number among four different number

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
            int x = (a<b ? a : b);
            int y = (c<d ? c : d);
            int z = (x<y ? x : y);
            System.out.println("Minimum :"+z);
        }
    }
