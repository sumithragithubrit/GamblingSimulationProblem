package com.gamlingsimulation;
import java.util.Random;

	public class GamblingSimulationProblem {
		
	    public static void main(String[] args) {
	        System.out.println("Welcome in Gambling Simulation Problem");
	        int stake = 100;
	        int bet = 1;
	        Random random = new Random();
	       int num = random.nextInt(2) + 0;

	        if (num == 1){
	            stake += bet;
	            System.out.println("gambler is win by "+ bet+" & total Stake is " + stake);

	        }
	        else if (num == 0){
	            stake -=bet;
	            System.out.println("gambler is loose by "+bet+" & total Stake is "+ stake );
	        }
	    }
}
