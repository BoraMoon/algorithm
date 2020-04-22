package algorithm.april22;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int people = sc.nextInt();
		int[] p = new int[people];
		int sum = 0;
		int total = 0;
		
		for(int i=0;i<people;i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		for(int i=0;i<p.length;i++) {
			sum += p[i];
			total += sum;
		}
		
		System.out.println(total);
		

	}

}
