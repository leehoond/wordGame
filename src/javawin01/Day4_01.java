package javawin01;

import java.util.Random;

public class Day4_01 {
	public static void main(String[] args) {
		
		int[] a = { 3, 7, 4, 15, 8 };
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (a[max] < a[i]) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
