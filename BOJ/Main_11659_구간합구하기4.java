import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659_구간합구하기4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

		int[] A = new int[N + 1];
		int[] S = new int[N + 1];
	
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
			S[i] = S[i - 1] + A[i];
		}
		
		StringBuilder sb = new StringBuilder();
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			sb.append(S[j] - S[i - 1]).append("\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}