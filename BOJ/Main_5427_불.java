import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_5427_불 {
	private static int h, w;
	private static char[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < h && 0 <= y && y < w) {
			return true;
		}
		
		return false;
	}
	
	public static int bfs(List<int[]> list) {
		Queue<int[]> queue = new LinkedList<>(list);
		int result = Integer.MAX_VALUE;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], z = poll[2];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(map[x][y] == '@') {
					if(!isRange(nx, ny)) {
						result = z + 1;
						return result;
					}
					
					if(isRange(nx, ny) && map[nx][ny] == '.') {
						queue.offer(new int[] { nx, ny, z + 1 });
						map[nx][ny] = '@';
					}
				}else {
					if(isRange(nx, ny) && (map[nx][ny] == '.' || map[nx][ny] == '@')) {
						queue.offer(new int[] { nx, ny, z + 1 });
						map[nx][ny] = '*';
					}
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
		
			map = new char[h][w];
			
			int r = 0, c = 0;
			List<int[]> list = new ArrayList<>();
			
			for(int i=0;i<h;i++) {
				String line = br.readLine();
				for(int j=0;j<w;j++) {
					map[i][j] = line.charAt(j);
					
					if(map[i][j] == '@') {
						r = i;
						c = j;
					}
					
					if(map[i][j] == '*') {
						list.add(new int[] { i, j, 0 });
					}
				}
			}
			
			list.add(0, new int[] { r, c, 0 });
			
			int result = bfs(list);
			if(result == Integer.MAX_VALUE) {
				sb.append("IMPOSSIBLE").append("\n");
			}else {
				sb.append(result).append("\n");
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}