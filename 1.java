//WAP to calculate area of circle 

import java.util.Scanner;
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the Radius");
            int r=sc.nextInt();
            double area=3.14*r*r;
            System.out.println("Area of Circle:"+area);
        }
    }
