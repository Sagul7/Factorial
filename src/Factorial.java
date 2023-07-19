import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
    public static int fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return fact(num-1) * num;
    }
}
/*
Find Factorial
Write a program to find the factorial of the given number A using recursion.
Note: The factorial of a number N is defined as the product of the numbers from 1 to N.

Input 1:
A = 4
Input 2:
A = 1

Output 1:
24
Output 2:
1

fact(n-1)*presentnum;
 */