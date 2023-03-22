import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_16234_인구이동 {
	public static int N, L, R;
	public static int sum, count;
	public static ArrayList<int[]> list;
	public static int[][] map;
	public static boolean[][] visit;
	
	public static final int[] dx = { -1, 1, 0, 0 };
	public static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < N && 0 <= y && y < N) {
			return true;
		}else { 
			return false;
		}
	}
	
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		count++; sum += map[x][y];
		list.add(new int[] { x, y });
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(isRange(nx, ny) && !visit[nx][ny]) {
				int diff = Math.abs(map[nx][ny] - map[x][y]);
				
				if(L <= diff && diff <= R) {
					dfs(nx, ny);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
	
		map = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int day = 0;
		while(true) {
			boolean flag = false;
			
			loop: for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					for(int d=0;d<4;d++) {
						int nx = i + dx[d];
						int ny = j + dy[d];
						
						if(isRange(nx, ny)) {
							int diff = Math.abs(map[nx][ny] - map[i][j]);
							
							if(L <= diff && diff <= R) {
								flag = true;
								break loop;
							}
						}
						
					}
				}
			}
			
			if(flag) {
				day++;
			}else {
				break;
			}
			
			visit = new boolean[N][N];
			
			// 인구이동 시작
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(!visit[i][j]) {
						sum = 0;
						count = 0;
						list = new ArrayList<>();
						
						dfs(i, j);
						
						int div = sum / count;
						for(int k=0;k<list.size();k++) {
							int[] get = list.get(k);
							int x = get[0], y = get[1];
							
							map[x][y] = div;
						}
					}
				}
			}
		}
	
		System.out.print(day);
	}
}