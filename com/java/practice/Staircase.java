package com.java.practice;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");

			}
			for (int x = 0; x <= i; x++) {
				System.out.print("#");
			}
			System.out.println("");
		}

	}

}
