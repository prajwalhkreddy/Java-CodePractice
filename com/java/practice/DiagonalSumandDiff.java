package com.java.practice;

import java.util.Scanner;

public class DiagonalSumandDiff {

	public static void main(String[] args) {
		
		int row, col, n, temp;
		int [][]arr;
		Scanner in=new Scanner(System.in);
		int l=0,r=0, sum=0;
		n=in.nextInt();
		arr=new int[n][n];
		for(row=0; row<n; row++){
			for(col=0;col<n;col++){
				arr[row][col]=in.nextInt();
				if(row==col){
					l=l+arr[row][col];
				}
			}
		}
		temp=n;
		for ( row=0; row<n;row++){
			r=r+arr[row][temp-1];
			temp=temp-1;
		}
		System.out.println(Math.abs(l-r));
		
		
		
	}

}
