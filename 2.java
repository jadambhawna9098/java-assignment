//WAP to calculate area of rectangle

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the Length");
            int l=sc.nextInt();
            System.out.println("Enter the Width");
            int w=sc.nextInt();
            int area = l*w;
            System.out.println("Area of Rectangle:"+area);
        }
    }
