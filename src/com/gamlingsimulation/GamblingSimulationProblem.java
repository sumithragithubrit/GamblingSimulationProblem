package com.gamlingsimulation;
import java.util.Random;

	public class GamblingSimulationProblem {
		
		public static void main(String[] args) {
			 System.out.println("Welcome in Gambling Simulation Problem");
		        int stake = 100;
		        int bet = 1;
		        int count = 0;
		        Random random = new Random();
		        System.out.println("Initial stake " + stake);

		        int day = 20;
		        for ( int i = 1;i <= day; i++ ){
		            int num = random.nextInt(2);

		            if (num == 1) {
		                stake += bet;
		                count++;
		                System.out.println("gambler is win by day => "+count +  " & total Stake is " + stake);

		            } else if (num == 0) {
		                stake -= bet;
		                count++;
		               System.out.println("gambler is loose by day => "+count +  " & total Stake is " + stake);

		            }else {
		                System.out.println("player stop gambling for day "  );
		            }

		        }
	    }
}
