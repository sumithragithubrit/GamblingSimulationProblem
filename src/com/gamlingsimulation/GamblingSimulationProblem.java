package com.gamlingsimulation;
import java.util.Random;

	public class GamblingSimulationProblem {
		
		public static void main(String[] args) {
	        System.out.println("Welcome in Gambling Simulation Problem");
	        int stake = 100;
	        int bet = 1;
	        Random random = new Random();
	        System.out.println("Initial stake " + stake);
	        while (stake != 150 && stake != 50) {
	            int num = random.nextInt(2);
	            System.out.println("num is "+num);
	            if (num == 1) {
	                stake += bet;

	                //System.out.println("gambler is win by " + bet + " & total Stake is " + stake);
	            } else if (num == 0) {
	                stake -= bet;
	              //  System.out.println("gambler is loose by " + bet + " & total Stake is " + stake);
	            }

	        }
	        if (stake >= 150) {
	            System.out.println("player win 50% of its initial stake " + stake);
	        } else {
	            System.out.println("player loose 50% of its initial stake " + stake);
	        }

	    }
}
