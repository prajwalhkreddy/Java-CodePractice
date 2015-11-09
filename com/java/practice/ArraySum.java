package com.java.practice;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		int n;
		int []arr;
		
		Scanner in = new Scanner(System.in);
		
		n=in.nextInt();
		
		arr=new int[n];
		int sum=0;
		for(int i=0; i<n; i++){
			arr[i]=in.nextInt();
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		

	}

}
