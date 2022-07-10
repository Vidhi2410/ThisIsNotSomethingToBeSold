/*
Author: Vidhi!
It just took 3hours to build this!
*/
import java.util.*;
public class ImprovisedCalci
{
    public static void ImprovisedCalci(String[] args){
    
    System.out.println("Hi, I am calculator!");
    
    Scanner scan1 = new Scanner(System.in);
    System.out.print("Enter 1st number: \n");
    int num1 = scan1.nextInt();
    
    Scanner scan2 = new Scanner(System.in);
    System.out.print("Enter 2nd number: \n");
    int num2 = scan2.nextInt();
    
    
    Scanner scan3 = new Scanner(System.in);
    
    System.out.println("Enter '+' for Addition");
    System.out.println("Enter '-' for Subtraction");
    System.out.println("Enter '*' for Multiplication");
    System.out.println("Enter '%' for Division");
    System.out.println("Enter '**' for Squaring of 1st number");
    System.out.println("Enter '***' for Cube of 1st number");
    System.out.println("Enter '**/' for SquareRoot of 1st number");
    System.out.println("Enter '***/' for CubeRoot of 1st number");
    System.out.println("Enter 'AOT' for Area of triangle");
    
    Scanner scan4 = new Scanner(System.in);
    String oper = scan4.nextLine();
    
    /*
     Switch statement is like younger but more brainy cousin of If-Else statements
     
     */
    switch (oper){ 
    case "+":
        System.out.print(num1+num2);
        break;
    case "-":
        System.out.println(num1-num2);
        break;
    case "*":
        System.out.println(num1*num2);
        break;
    case "%":
        System.out.println(num1/num2);
        break;
    case "**":
        System.out.println(num1*num1);
        break;
    case "**/":
        System.out.println(Math.sqrt(num1));
        break;
    case "***":
        System.out.println(num1*num1*num1);
        break;
    case "***/":
        System.out.println(Math.cbrt(num1));
        break;
    case "AOT":
        System.out.println(0.5*(num2*num1));
        break;
    default:
        System.out.println("I don't know this operator!");
      }
   }
}
