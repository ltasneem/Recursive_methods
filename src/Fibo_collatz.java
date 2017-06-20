import java.util.Scanner;

public class Fibo_collatz {
	
	public static int fibo(int n)
	{
		if(n<=1) return n;
		else return fibo(n-1)+fibo(n-2);
	}
	
	public static void collatz(int n)
	{
		if(n==1) 
		{
			System.out.println(n);
		}
		else if(n%2==0)
		{
			collatz(n/2);
		}
		else if(n%2 !=0)
		{
			collatz(3*n+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int num1,num2;
		/*fibonacchi*/
		//fibo(20);
		for (int i = 1; i <= 20; i++)
            System.out.println(i + ": " + fibo(i));
		
		/*Collatz conjecture*/
		
		System.out.println("Enter 2 number to get their collatz number : ");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		collatz(num1);
		collatz(num2);
	}

}
