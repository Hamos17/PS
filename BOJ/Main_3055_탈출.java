import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_3055_탈출 {
	private static int R, C;
	private static char[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	public static boolean isRange(int x, int y) {
		if(0 > x || x >= R || 0 > y || y >= C) return false;
		return true;
	}
	
	public static int bfs(List<int[]> list) {
		Queue<int[]> queue = new LinkedList<>(list);
		int time = Integer.MAX_VALUE;
		
		loop: while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], count = poll[2];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(!isRange(nx, ny)) {
					continue;
				}
				
				if(map[x][y] == 'S') {
					if(map[nx][ny] == '.') {
						queue.offer(new int[] { nx, ny, count + 1 });
						map[nx][ny] = 'S';
					}
					
					if(map[nx][ny] == 'D') {
						time = count + 1;
						break loop;
					}
				}else {
					if(map[nx][ny] == '.' || map[nx][ny] == 'S') {
						queue.offer(new int[] { nx, ny, count + 1 });
						map[nx][ny] = '*';
					}
				}
			}
		}

		return time;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
	
		map = new char[R][C];
		
		int x = -1, y = -1; 
		List<int[]> list = new ArrayList<>();
		
		for(int i=0;i<R;i++) {
			String line = br.readLine();
			for(int j=0;j<C;j++) {
				map[i][j] = line.charAt(j);
				
				if(map[i][j] == 'S') {
					x = i;
					y = j;
				}
				
				if(map[i][j] == '*') {
					list.add(new int[] { i, j, 0 });
				}
			}
		}
		
		list.add(0, new int[] { x, y, 0 });
	
		int result = bfs(list);
		
		if(result == Integer.MAX_VALUE) {
			System.out.print("KAKTUS");
		}else {
			System.out.print(result);
		}
	}
}