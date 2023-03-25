import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1926_그림 {
	private static int n, m, area;
	private static int[][] paper;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static void dfs(int x, int y) {
		area++;
		visit[x][y] = true;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(0 <= nx && nx < n && 0 <= ny && ny < m && !visit[nx][ny] && paper[nx][ny] == 1) {
				dfs(nx, ny);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
	
		paper = new int[n][m];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<m;j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		visit = new boolean[n][m];
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(!visit[i][j] && paper[i][j] == 1) {
					area = 0;
					dfs(i, j);
					
					list.add(area);
				}
			}
		}
		
		Collections.sort(list);
		
		if(list.size() == 0) {
			System.out.print("0\n0");
		}else {
			System.out.print(list.size() + "\n" + list.get(list.size() - 1));
		}
	}
}