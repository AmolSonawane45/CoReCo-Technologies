package com.amol.radioactivedecay;

public class Decay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mass = 100; 
        double halfLifeTime = 5; 
        int numHalfLives = 3;
        
        double[] result = calculation(mass, halfLifeTime, numHalfLives);
        
        System.out.println("Remaining mass: " + result[0]);
        System.out.println("Years elapsed: " + result[1]);
    }
	    
    public static double[] calculation(double initialMass, double halfLifeTime, int numHalfLives) 
    {
        double remainingMass = initialMass;
        double years = 0;
        
        for (int i = 0; i < numHalfLives; i++) 
        {
            remainingMass = remainingMass / 2; 
            years = years + halfLifeTime; 
        }
        
        double[] result = {remainingMass, years};
        return result;
    }

}
