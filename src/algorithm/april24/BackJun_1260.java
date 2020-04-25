package algorithm.april24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BackJun_1260 {
	private static Scanner sc = new Scanner(System.in);
	private static int n,m,v ;			//정점개수, 간선개수, 탐색할 첫 번호
	private static boolean[] visit;	//방문여부 
	private static int[][] map;				//그릴지도
	
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		map = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i=1;i<=m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			map [x][y] = map [y][x] = 1;
			
		}
		
		dfs(v,n);
		visit = new boolean[n+1];
		System.out.println();
		bfs(v,n);
		
	}
	
	private static void bfs(int v, int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(v);
		visit[v] = true;
		
		while(!queue.isEmpty()) {
			int poll = queue.poll();
			System.out.print(poll +" ");
			for(int i=1;i<=n;i++) {
				if(map[poll][i] == 1 && !visit[i]) {
					queue.offer(i);
					visit[i] = true;
				}
			}
		}
	}

	public static void dfs(int v,int n) {
		if(visit[v]) return;
		
		visit[v] = true;
		System.out.print(v+" ");
		for(int i = 1; i<=n; i++) {
			if(map[v][i]==1 && visit[i]==false) {
				dfs(i,n);
			}
		}
	}

}
