import java.util.*;

public class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int a = sc.nextInt();
    System.out.print("Enter the second number : ");
    int b = sc.nextInt();
    System.out.print("Choose the operation to be performed : ");
    int operator = sc.nextInt();

/* 1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b */


switch(operator) {
        case 1 : System.out.println(a+b);
        break;
        case 2 : System.out.println(a-b);
        break;
        case 3 : System.out.println(a*b);
        break;
        case 4 :  System.out.println(a%b);
        break;
        default : System.out.println("Invalid operator");
    }
 }
}
