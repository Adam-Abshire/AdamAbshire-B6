package com.noorteck.java.hw8;

public class AverageNumber {
	public static void main(String[] args) {
		int total = 0;
		int iterations = 0;
		for (int i = 20; i <= 30; i++) {
			total+=i;
			iterations+=1;
		}
		System.out.println(total/iterations);
		
		int tot = 0;
		int iter = 0;
		int j = 20;
		while(j <= 30) {
			tot+=j;
			iter+=1;
			j++;
		}
		System.out.println(tot/iter);
		
		int to = 0;
		int it = 0;
		int k = 20;
		do {
			to+=k;
			it+=1;
			k++;
		} while(k<=30);
		System.out.println(to/it);
	}
}
