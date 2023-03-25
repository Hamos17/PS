import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_14889_스타트와링크 {
	private static int[][] arr;
	private static int[] data;
	private static int[] result;
	private static boolean[] visit;
	private static int diff;
	
	public static void combination(int N, int R, int depth, int start) {
		if(depth == R) {
			// start
			List<Integer> team1 = new ArrayList<>();
			for(int i=0;i<R;i++) {
				team1.add(result[i]);
			}
			
			// link
			List<Integer> team2 = new ArrayList<>();
			for(int i=0;i<N;i++) {
				if(!visit[i]) {
					team2.add(data[i]);
				}
			}
			
			int sum1 = 0;
			for(int i=0;i<team1.size();i++) {
				for(int j=i+1;j<team1.size();j++) {
					sum1 += (arr[team1.get(i)][team1.get(j)] + arr[team1.get(j)][team1.get(i)]);
				}
			}
			
			int sum2 = 0;
			for(int i=0;i<team2.size();i++) {
				for(int j=i+1;j<team2.size();j++) {
					sum2 += (arr[team2.get(i)][team2.get(j)] + arr[team2.get(j)][team2.get(i)]);
				}
			}
			
			diff = Math.min(diff, Math.abs(sum1 - sum2));
			return;
		}
		
		for(int i=start;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				result[depth] = data[i];
				
				combination(N, R, depth + 1, i);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<=N;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		data = new int[N];
		for(int i=1;i<=N;i++) {
			data[i-1] = i;
		}
		
		result = new int[N/2];
		visit = new boolean[N];
		
		diff = Integer.MAX_VALUE;
		combination(N, N/2, 0, 0);
	
		System.out.print(diff);
	}
}