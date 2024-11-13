package day1;
import java.util.Scanner;
import java.util.Random;

public class FlipCoin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NoofFlips");
		Random random = new Random();
        
		int noOfFlips = 0;
		noOfFlips=Integer.parseInt(sc.nextLine());
		if(noOfFlips <0)
		{
			System.out.println("Inavlid Filps Count");
			return;
		}
		int headCount=0;
		int tailCount=0;
		for(int i=0;i<noOfFlips;i++)
		{
			double flip=random.nextDouble();
			if(flip < 0.5)
				headCount++;
			else
				tailCount++;
		}
		double headPerc=(double)headCount/noOfFlips * 100;
		double tailPerc=(double)tailCount/noOfFlips * 100;
		System.out.println(headPerc);
		System.out.println(tailPerc);	
	}

}
