package com.java.practice;
import java.io.*;

/*First sort the activities based on finish time, then choose the first activity by default
 * Next choose non-overlapping activities
 * Run Time: O(nlgn) 
 * Sorting: O(nlogn), Selection: O(n) 
 */

public class ActivitySelectionGreedy {

public static int[]s = {1,3,0,5,8,5};
public static int[]f = {2,4,6,7,9,9};
public static int n=s.length;
	public static void main(String[] args) {
		int j=0;
		System.out.println(j);
		
		for(int i=1;i<n;i++){
			if(f[j]<s[i]){
				System.out.println(i);
				j=i;
			}
		}
		
		
	}
	
}
