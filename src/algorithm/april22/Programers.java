package algorithm.april22;

import java.util.ArrayList;
import java.util.Scanner;

public class Programers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5,1,2,3,4,5};
		solution(answers);

	}

	 public static int[] solution(int[] answers) {
		 
	        int[] answer = {};
	        int[] arr1 = {1,2,3,4,5};
	        int[] arr2 = {2,1,2,3,2,4,2,5};
	        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
	        int[] cnt = new int[3];
	        
	        for(int i = 0 ; i<answers.length;i++){
	            if(arr1[i%5] == answers[i]) cnt[0]++;
	            if(arr2[i%8] == answers[i]) cnt[1]++;
	            if(arr3[i%10] == answers[i]) cnt[2]++;
	        }
	        
	        int max = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
	        
	        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
	        for(int i=0; i<cnt.length; i++) {
	            if(max==cnt[i]) {
	                a1.add(i+1);
	            }
	        }
	        answer = new int[a1.size()];
	 
	        for(int i=0; i<a1.size(); i++) {
	            answer[i] = a1.get(i);
	        }
	       
	        
	        return answer;
	    }

	
	
}
