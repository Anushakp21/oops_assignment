package day1;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		if(args.length !=1)
		{
			System.out.println("Invalid Command Line Argument");
			return;
		}
		int x=Integer.parseInt(args[0]);
		if(x>=0 || x<31)
		{
			System.out.println("power of 2 upto 2 "+x);
			for(int i=0;i<=x;i++)
			{
				System.out.println("2 ^ "+i+" = "+(long)Math.pow(2,i));
			}
		
		}
		else
		{
			System.out.println("Invalid Input ");
		}
		
	}

}
