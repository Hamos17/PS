import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2444_별찍기7 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=2*N-1;j++) {
				if(N-i < j && j < N+i) {
					sb.append("*");
				}else {
					if(j <= N-i) {
						sb.append(" ");
					}
				}
			}

			sb.append("\n");
		}

		for(int i=1;i<N;i++) {
			for(int j=1;j<=2*N-1;j++) {
				if(i < j && j <= 2 * N - 1 - i) {
					sb.append("*");
				}else {
					if(j <= i) {
						sb.append(" ");
					}
				}
			}

			sb.append("\n");
		}
		
		
		System.out.println(sb.toString());
	}
}
