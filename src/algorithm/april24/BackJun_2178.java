package algorithm.april24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BackJun_2178 {
	private static Scanner sc = new Scanner(System.in);
	private static int[][] visit; // 방문여부
	private static int[][] map; // 그릴지도
	private static int dx[] = { 0, 0, 1, -1 };
	private static int dy[] = { 1, -1, 0, 0 };
	private static int n;
	private static int m;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		visit = new int[n][m];

		for (int i = 0; i < n; i++) {
			String input = sc.next();
			for (int j = 0; j < m; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}

		bfs(0, 0);
		System.out.println(visit[n-1][m-1]);

	}

	public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x,y});
        visit[x][y] = 1;

        while(!q.isEmpty()){
            int location[] = q.poll();

            for(int dir = 0; dir<4; dir++){
                int r = location[0] + dx[dir];
                int c = location[1] + dy[dir];
          
                //좌표가 -1이 되거나 N or M이 되어 map의 범위를 벗어나면 안되므로
                if(r >= 0 && c >= 0 && r < n && c < m){
                    if(map[r][c] == 1 && visit[r][c] == 0){                    	
                        q.offer(new int[] {r,c});
                        visit[r][c] = visit[location[0]][location[1]] + 1;
                    }
                }
            }
        }
    }

}
