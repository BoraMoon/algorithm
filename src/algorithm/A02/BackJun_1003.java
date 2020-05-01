package algorithm.A02;

import java.util.Scanner;

public class BackJun_1003 {
	private static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		int t = sc.nextInt(); 		//테스트 개수
		int[][] arr = new int[41][2];
		
		arr[0][0]=1;
		arr[1][1]=1;
		
		for(int i=2; i<=40;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = arr[i-1][j]+arr[i-2][j];
				
			}
		}
		for(int i=0; i<t;i++) {
			int a = sc.nextInt();
			System.out.println(arr[a][0] + " " + arr[a][1]);	 
		}
	}

}
