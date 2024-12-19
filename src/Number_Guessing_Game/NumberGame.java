package Number_Guessing_Game;

import java.util.Scanner; 

public class NumberGame {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int ran_number=(int)(Math.random()*6)+1;
		
		int guess=0;
		int attempt=0;
		int maxattempt=3;
		boolean haswon=false;
		
		System.out.println("Welcome To Number Guessing game");
		System.out.println("I have choosen number of dice 1 to 6.");
		System.out.println("Can you guess it in "+ maxattempt +" attempt");
		
		while(attempt<maxattempt) {
			System.out.print("Enter Guess Number:");
			guess=sc.nextInt();
			attempt++;
			
			if(guess==ran_number) {
				haswon=true;
				break;
			}
			else{
				System.out.println("Wrong number!,Try again!!");
			}
		
			
			
			System.out.println("Remaining attempts:"+(maxattempt-attempt));
		}
		
		if(haswon) {
			System.out.println("\nCongratulation!You guess number in "+attempt+" attempt");
		}
		else {
			System.out.println("\nSorry,You have used all your attempts. The number was:"+ran_number);
		}
			System.out.println("Thanks for Playing!!!!");
			sc.close();
	}

}
