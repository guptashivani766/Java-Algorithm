package com.programs;

public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts= {{1,2,8},{3,2,1}};
		System.out.println(maximumwealth(accounts));
	}
	public static int maximumwealth(int[][] accounts) {
		//person=row
		//account=col
		int ans=Integer.MIN_VALUE;
		
		//for(int person=0;person<accounts.length;person++)
		
		for(int[] person:accounts){
			//when you start a new col,take a sum for that row
			int count=0;
			
			//for(int account=0;account<accounts[person].length;account++)
			
			for(int account:person){
				count+=account;
			}
			//now we have sum of accounts of person
			//check with overall ans
			if(count>ans) {
				ans=count;
			}
		}
		return ans;
	}

}
