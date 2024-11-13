package day1;

import java.util.Scanner;

public class StringEN {

	public static void main(String[] args) {
//		String s1="Anusha";
//		String s2="Anusha";
//		System.out.println(s1.equals(s2));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean rs=StringsEqorNot(s1,s2);
		if(rs)
		{
			System.out.println("Strings are Equal");
		}
		else
			System.out.println("Strings are not equal");
	}

	 static boolean StringsEqorNot(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		for(int i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)!=s2.charAt(i))
			return false;
		}
		return true;
	}

}
