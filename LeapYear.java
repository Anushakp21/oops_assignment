package day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year < 999 || year > 9999)
			System.out.println("Invalid year");
		if( year > 999 && year < 9999)
			if(year%400==0 || year%4==0 & year %100 !=0)
				System.out.println("Year is a leap Year");
			else
				System.out.println("year is not a leap year");
		

	}

}
