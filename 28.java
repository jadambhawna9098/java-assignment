//Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.


import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {

    char operator;
    double number1, number2, result;
    
    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, /, <, >, or =");
    operator = input.next().charAt(0);

  
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

     
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

   
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

    
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      case '<':
        boolean res = number1 < number2;
        System.out.println(number1 + " < " + number2 + " = " + res);
        break;
        
      case '>':
        res = number1 < number2;
        System.out.println(number1 + " > " + number2 + " = " + res);
        break;
        
        
      case '=':
        if(number1 == number2){
        System.out.println("Equal :");
        }else{
        System.out.println("Not Equal :");
        }
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    
      }
          
          }


