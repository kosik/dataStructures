package javaapplication1;

import java.util.Arrays;

//NOTE: Recursive dynamic solution here
public class Fibonacci {
	int item;
	
	public static void main(String[] args){
		int n = 40;
		int[] fNumbers = new int[n+1];
		fNumbers[n]=1;
		fNumbers[n-1]=1;
		
		final Fibonacci f = new Fibonacci();
		f.fib(n, fNumbers);
		System.out.println(Arrays.toString(fNumbers));
	}
	
	public void fib(int n, int[] fNumbers){
		if(n>1){
			int pos = n-1;
			fNumbers[pos-1] = fNumbers[n]+fNumbers[pos];
			fib(--n, fNumbers);
		}
	}
}
