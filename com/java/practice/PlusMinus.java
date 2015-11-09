package com.java.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		double pos=0.0,z=0.0,neg=0.0;
		int n;
		int []arr;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		arr=new int[n];
		for (int i=0;i<n;i++){
			arr[i]=in.nextInt();
			if(arr[i]>0)
				pos++;
			else if(arr[i]<0)
				neg++;
			else if(arr[i]==0)
				z++;
				
		}
		DecimalFormat temp= new DecimalFormat("#.000");
		double x=pos/n;
		System.out.println(temp.format(x));
		System.out.println(temp.format(neg/n));
		System.out.println(temp.format(z/n));
		}

}
