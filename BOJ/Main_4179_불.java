import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4179_불 {
	private static int R, C;
	private static char[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < R && 0 <= y && y < C) {
			return true;
		}
		
		return false;
	}
	
	public static int bfs(List<int[]> list) {
		Queue<int[]> queue = new LinkedList<>(list);
		int result = Integer.MAX_VALUE;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], sec = poll[2];

			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(map[x][y] == 'J') {
					if(!isRange(nx, ny)) {
						result = sec + 1;
						return result;
					}
					
					if(isRange(nx, ny) && map[nx][ny] == '.') {
						queue.offer(new int[] { nx, ny, sec + 1 });
						map[nx][ny] = 'J';
					}
				}else {
					if(isRange(nx, ny) && (map[nx][ny] == '.' || map[nx][ny] == 'J')) {
						queue.offer(new int[] { nx, ny, sec + 1 });
						map[nx][ny] = 'F';
					}
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
	
		map = new char[R][C];
		
		int startX = -1, startY = -1;
		List<int[]> list = new ArrayList<>();
		
		for(int i=0;i<R;i++) {
			String input = br.readLine();
			for(int j=0;j<C;j++) {
				map[i][j] = input.charAt(j);
			
				if(map[i][j] == 'J') {
					startX = i;
					startY = j;
				}
				
				if(map[i][j] == 'F') {
					list.add(new int[] { i, j, 0 });
				}
			}
		}
		
		list.add(0, new int[] { startX, startY, 0 });
		
		int result = bfs(list);

		if(result == Integer.MAX_VALUE) {
			System.out.print("IMPOSSIBLE");
		}else {
			System.out.print(result);
		}
	}
}