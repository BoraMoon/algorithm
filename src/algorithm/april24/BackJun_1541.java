package algorithm.april24;

import java.util.Scanner;

public class BackJun_1541 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = sc.next();
		int result = 0;
		String[] splitStr = str.split("-");
		
		for(int i=0;i<splitStr.length;i++) {
			
			if(splitStr[i].contains("+")) {
				int sum = 0;
				String[] s = splitStr[i].split("\\+");
				for(int j = 0; j<s.length;j++) {
					sum += Integer.parseInt(s[j]) ;
				}
				if(i==0) result = sum;
				else result -= sum;
			}else {
				result -= Integer.parseInt(splitStr[i]);
				
			}

		}
		System.out.println(result);
		
		
	}

}
