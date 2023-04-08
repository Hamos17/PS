import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_6593_상범빌딩 {
	private static int L, R, C;
	private static char[][][] building;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int nx, int ny) {
		if(0 <= nx && nx < R && 0 <= ny && ny < C) {
			return true;
		}
		
		return false;
	}
	
	public static int bfs(int k, int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][][] visit = new boolean[L][R][C];

		queue.offer(new int[] { k, x, y, 0 });
		visit[k][x][y] = true;
		
		int result = Integer.MAX_VALUE;
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int curH = poll[0], curX = poll[1], curY = poll[2], minute = poll[3];
			
			if(building[curH][curX][curY] == 'E') {
				result = minute;
				break;
			}
			
			if(curH - 1 >= 0 && !visit[curH - 1][curX][curY] && building[curH - 1][curX][curY] != '#') {
				queue.offer(new int[] { curH - 1, curX, curY, minute + 1 });
				visit[curH - 1][curX][curY] = true;
			}
			
			if(curH + 1 < L && !visit[curH + 1][curX][curY] && building[curH + 1][curX][curY] != '#') {
				queue.offer(new int[] { curH + 1, curX, curY, minute + 1 });
				visit[curH + 1][curX][curY] = true;
			}
			
			for(int d=0;d<4;d++) {
				int nextX = curX + dx[d];
				int nextY = curY + dy[d];
				
				if(isRange(nextX, nextY) && !visit[curH][nextX][nextY] && building[curH][nextX][nextY] != '#') {
					queue.offer(new int[] { curH, nextX, nextY, minute + 1 });
					visit[curH][nextX][nextY] = true;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());

			if(L == 0 && R == 0 && C == 0) {
				break;
			}
			
			building = new char[L][R][C];
			
			int k = -1, x = -1, y = -1;
			for(int h=0;h<L;h++) {
				for(int i=0;i<R;i++) {
					String input = br.readLine();
					for(int j=0;j<C;j++) {
						building[h][i][j] = input.charAt(j);
						
						if(building[h][i][j] == 'S') {
							k = h;
							x = i;
							y = j;
						}
					}
				}

				br.readLine();
			}
			
			int result = bfs(k, x, y);
			
			if(result != Integer.MAX_VALUE) {
				sb.append("Escaped in ").append(result).append(" minute(s).").append("\n");
			}else {
				sb.append("Trapped!").append("\n");
			}
		}
	
		System.out.print(sb.toString().trim());
	}
}