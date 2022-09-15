package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input start amount:");
		int startAmount = in.nextInt();
		System.out.println("Input win chance (from 0 to 0.9):");
		double winChance = in.nextDouble();
		System.out.println("Input win limit:");
		double winLimit = in.nextDouble();
		int attempts = 0;
		while(startAmount > 0 && startAmount < winLimit)
		{
			double x = Math.random();
			boolean win = (x < winChance);
			attempts ++;
			System.out.println("Attempt " + attempts);
			if(win)
			{
				System.out.println("Win");
				startAmount ++;
				System.out.println("Balance: " + startAmount);
			}
			else
			{
				System.out.println("Loss");
				startAmount --;
				System.out.println("Balance: " + startAmount);
			}
		}
	}

}
