import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10810_공넣기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[] basket = new int[N+1];
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
		
			for(int i=start;i<=end;i++) {
				basket[i] = ball;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(basket[i]).append(" ");
		}
		
		System.out.print(sb.toString().trim());
	}
}