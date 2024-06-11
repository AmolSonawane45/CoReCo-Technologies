package com.amol.tiletactics;

public class TileTactics {

	public static void main(String[] args) {
       
        System.out.println(possibleBonus(3, 7)); 
        System.out.println(possibleBonus(1, 9)); 
        System.out.println(possibleBonus(5, 3)); 
        System.out.println(possibleBonus(1, 1)); 
    }

    public static boolean possibleBonus(int yourTile, int friendTile) 
    {
        if (yourTile == friendTile) 
        {
            return false;
        } 
        for (int i = 1; i <= 6; i++) 
        {
            yourTile = yourTile + 1;
            if (yourTile == friendTile) 
            {
              return true;
            } 
        }
          return false;
    }
}
