package algorithm.april24;

import java.util.Scanner;

public class BackJun_5585 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int price = sc.nextInt(); //구매한 상품의 가격 
		int[] coinArr = {500,100,50,10,5,1};
		int coinNum = 0;
		int change = 1000 - price;	//거스름돈
		
		for(int i=0;i<6;i++) {
			if(change/coinArr[i]>0) {
				coinNum += change/coinArr[i];
				change = change%coinArr[i];
					
			}
		}
		System.out.println(coinNum);
		
	}

}
