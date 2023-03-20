import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10844_쉬운계단수 {
	private static final int CONST = (int)(1E9);

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[][] dp = new int[N+1][10];

		for(int i=1;i<=9;i++) {
			dp[1][i] = 1;
		}

		for(int i=2;i<=N;i++) {
			for(int j=0;j<=9;j++) {
				if(0 <= j - 1) {
					dp[i][j] += dp[i-1][j-1];
				}

				if(j + 1 <= 9) {
					dp[i][j] += dp[i-1][j+1];
				}

				dp[i][j] %= CONST;
			}
		}

		long count = 0;
		for(int i=0;i<=9;i++) {
			count += dp[N][i];
		}

		System.out.print(count % CONST);
	}
}