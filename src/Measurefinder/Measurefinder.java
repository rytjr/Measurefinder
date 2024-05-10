package Measurefinder;

import java.util.*;

public class Measurefinder {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 0; i < num; i++) {
			int num2 = sc.nextInt();
			for(int j = 1; j < num2+1; j++) {
				if(num2%j == 0) {
					++sum;
				}
			}
			if(sum == 2) {
				++sum2;
			}
			sum = 0;
		}
		System.out.print(sum2);
	}
}