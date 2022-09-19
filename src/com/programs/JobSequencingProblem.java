package com.programs;
import java.util.*;
public class JobSequencingProblem {
	static class Job{
		int id;
		int deadLine;
		int profit;
		Job(int i,int d,int p){
			id=i;
			deadLine=d;
			profit=p;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int jobInfo[][]= {{4,20},{1,10},{1,40},{1,30}};
     ArrayList<Job> jobs=new ArrayList<>();
     for(int i=0;i<jobInfo.length;i++) {
    	 jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
    	 
     }
     
     // sort in descending order-2D array sorting by using Collections
     Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
     
     ArrayList<Integer> seq=new ArrayList<>();
     int time=0;
     for(int i=0;i<jobs.size();i++) {
    	 Job curr=jobs.get(i);
//		to access the value present in jobs
//    	System.out.println("deadLine of"+i+"is="+currList.deadLine);
//    	System.out.println("id of"+i+"is="+currList.id);
//    	System.out.println("profit of"+i+"is="+currList.profit);
    	 
    	 if(curr.deadLine>time) {
    		 seq.add(curr.id);
    		 time++;
    	 }
    	
     }
     System.out.println("max jobs ="+seq.size());
     for(int i=0;i<seq.size();i++) {
    	 System.out.println(seq.get(i)+"");
     }
     System.out.println();
     
    
	}

}
