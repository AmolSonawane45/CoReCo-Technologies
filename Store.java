package com.amol.store;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner scanner = new Scanner(System.in);
	 
	 int price = 0;
	 System.out.println("*****Welcome to Mauli Store******\n");
	 System.out.print("Enter the item number that you want to buy: \n\t1.TV \n\t2.FRIDGE \n\t3.AC\n\n");
	 int choice = scanner.nextInt();
	 if(choice == 1)
		 price = 35000;
	 if(choice == 2)
		 price = 21000;
	 if(choice == 3)
		 price = 55000;
	 
	 System.out.println("You selected Item Price is : "+price);

		System.out.println("|| Enter the INR notes information that you have || \n");
        System.out.print("\tEnter number of INR 10 notes:");
        int tenNotes = scanner.nextInt();

        System.out.print("\tEnter number of INR 50 notes:");
        int fiftyNotes = scanner.nextInt();

        System.out.print("\tEnter number of INR 100 notes:");
        int hundredNotes = scanner.nextInt();

        System.out.print("\tEnter number of INR 200 notes:");
        int twoHundredNotes = scanner.nextInt();

        

        String result = canPurchase(tenNotes, fiftyNotes, hundredNotes, twoHundredNotes, price);
        System.out.println(result);

        scanner.close();
    }

    public static String canPurchase(int tenNotes, int fiftyNotes, int hundredNotes, int twoHundredNotes, int price) 
    {
        int totalMoney = (tenNotes * 10) + (fiftyNotes * 50) + (hundredNotes * 100) + (twoHundredNotes * 200);

        if (totalMoney >= price) 
        {
            return "\n----------I can purchase this Item----------";
        } else 
        {
            return "\n----------I need more money for this Item----------";
        }
    }
}
