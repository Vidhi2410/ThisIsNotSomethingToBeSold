import java.util.*;
public class CalciUsingIfElse    
{    
    public static void main(String[] args)   
    
    {    
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
    
    Scanner scan4 = new Scanner(System.in);
    String oper = scan4.nextLine();
    
    if (oper.equals("+")){
        System.out.println(num1+num2);}
    else if (oper.equals("-")){
        System.out.println(num1-num2);}
    else if (oper.equals("*")){
        System.out.println(num1*num2);}
    else if (oper.equals("/")){
        System.out.println(num1/num2);}
    else if (oper.equals("**")){
        System.out.println(num1*num1);}
    else if (oper.equals("***")){
        System.out.println(num1*num1*num1);}
    else if (oper.equals("**/")){
        System.out.println(Math.sqrt(num1));}
    else if (oper.equals("***/")){
        System.out.println(Math.cbrt(num1));}
    else{
        System.out.println("Please enter a valid operator!");}
    } 
}