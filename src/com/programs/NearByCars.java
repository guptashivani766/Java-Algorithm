package com.programs;
import java.util.*;

public class NearByCars {
	static class point implements Comparable<point>{
		int x;
		int y;
		int dissq;
		int idx;
		public point(int x,int y, int distsq, int idx) {
			this.x=x;
			this.y=y;
			this.dissq=dissq;
			this.idx=idx;
			
		}
		@Override
	    public int compareTo(point p2) {
	    	return this.dissq - p2.dissq;
	    }
		
	}

	public static void main(String[] args) {
		int pts[][] = {{3,3},{5,-1},{-2,4}};
		int k=2;
		PriorityQueue<point> pq = new PriorityQueue<>();
		for(int i=0;i<pts.length;i++) {
			int dissq = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
			pq.add(new point(pts[i][0],pts[i][1],dissq,i));
		}
		for(int i=0;i<k;i++) {
			System.out.println("C"+pq.remove().idx);
		}

	}

}
