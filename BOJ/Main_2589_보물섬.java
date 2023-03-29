import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2589_보물섬 {
	private static int N, M;
	private static char[][] map;
	
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static int bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][M];
		
		queue.offer(new int[] { i, j, 0 });
		visit[i][j] = true;
		
		int result = 0;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], z = poll[2];
			
			if(map[x][y] == 'L') {
				result = Math.max(result, z);
			}
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < M && !visit[nx][ny] && map[nx][ny] == 'L') {
					queue.offer(new int[] { nx, ny, z + 1 });
					visit[nx][ny] = true;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new char[N][M];
		for(int i=0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j] = line.charAt(j);
			}
		}
		
		int time = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j] == 'L') {
					int result = bfs(i, j);
					time = Math.max(time, result);
				}
			}
		}
		
		System.out.print(time);
	}
}