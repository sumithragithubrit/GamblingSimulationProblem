package com.gamlingsimulation;
import java.util.Random;

	public class GamblingSimulationProblem {
		
		static int monthCount = 0;
	    public static void main(String[] args) {


	        // GamblingSimulationProblem obj = new GamblingSimulationProblem();
	        System.out.println("Welcome in Gambling Simulation Problem");

	        int month = 2;
	        for (int k = 1; k <= month; k++) {
	             monthCount++;
	            everyDayWonOrLost();

	        }

	    }

	        public static void everyDayWonOrLost() {
	             int stake = 100;
	             int bet = 1;
	             int count = 0;

	            Random random = new Random();
	            System.out.println("Initial stake month: "+monthCount+" => " + stake);

	            int day = 20;
	            for (int i = 1; i <= day; i++) {
	                int num = (int) Math.floor(Math.random()*10) %2;

	                if (num == 1) {
	                    stake += bet;
	                    count++;
	                    System.out.println("gambler is win by day => " + count + " & total Stake is " + stake);

	                } else  {
	                    stake -= bet;
	                    count++;
	                    System.out.println("gambler is loose by day => " + count + " & total Stake is " + stake);

	                }


	            }
	        }

}
