import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2636_치즈 {
	private static int N, M;
	private static int[][] map;
	private static boolean[][] visit;
	private static boolean[][] melt;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static int search() {
		int count = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j] == 1) {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(0 <= nx && nx < N && 0 <= ny && ny < M && !visit[nx][ny]) {
				if(map[nx][ny] == 0) {
					dfs(nx, ny);
				}else {
					melt[nx][ny] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int hour = 0, cheeze = 0;
		while(true) {
			int count = 0;
			
			count = search();
			if(count == 0) {
				break;
			}

			cheeze = count;
			
			hour++;
			
			visit = new boolean[N][M];
			melt = new boolean[N][M];
			
			dfs(0, 0);
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(melt[i][j]) {
						map[i][j] = 0;
					}
				}
			}
		}
		
		System.out.print(hour + "\n" + cheeze);
	}
}
