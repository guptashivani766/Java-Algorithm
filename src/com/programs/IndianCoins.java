package com.programs;
import java.util.*;

public class IndianCoins {

	public static void main(String[] args) {
		Integer coins[]= {1,2,5,10,20,50,100,200,500,1000,20000};
	// sort the coins in descending order
		Arrays.sort(coins,Collections.reverseOrder());
		
		int countCoin = 0;
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		ArrayList<Integer> ans=new ArrayList<>();
		
		for(int i=0;i<coins.length;i++) {
			if(coins[i]<=amount) {
				while(coins[i]<=amount) {
					countCoin++;
					ans.add(coins[i]);
					amount=amount-coins[i];
					
				}
			}
		}
		System.out.println("the no. of coins used="+countCoin);
		System.out.println("these coin are="+ans);
	}

}
