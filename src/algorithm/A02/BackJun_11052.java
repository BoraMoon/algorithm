package algorithm.A02;

import java.util.Scanner;

public class BackJun_11052 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] price = new int[n+1];
		
		for(int i=1;i<=n; i++) {
			price[i] = sc.nextInt();
		}
		
		int[] dp = new int [n+1];
		
		dp[1] = price[1];
		
		for(int i=2; i<=n;i++) {
			dp[i] = price[i];
			for(int j=0; j<=i;j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+dp[j]);
			}
		}
		System.out.println(dp[n]);
	}

}
