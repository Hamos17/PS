import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14500_테트로미노 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[][] arr = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int result = 0;
		for(int i=0;i<=N-1;i++) {
			int sum = 0;
			for(int j=0;j<=M-4;j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i][j+3];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-4;i++) {
			int sum = 0;
			for(int j=0;j<=M-1;j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j];
				result = Math.max(result, sum);
			}
		}

		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i][j+1] + arr[i+1][j+1];
				result = Math.max(result, sum);
			}
		}

		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+2][j];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i][j+1];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i+1][j] + arr[i][j+2] + arr[i+1][j+1] + arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i][j+1] + arr[i][j+2] + arr[i+1][j] + arr[i+1][j+1];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}
	
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i][j+2];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-2;i++) {
			int sum = 0;
			for(int j=0;j<=M-3;j++) {
				sum = arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+1][j+1];
				result = Math.max(result, sum);
			}
		}
		
		for(int i=0;i<=N-3;i++) {
			int sum = 0;
			for(int j=0;j<=M-2;j++) {
				sum = arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1];
				result = Math.max(result, sum);
			}
		}
		
		System.out.print(result);
	}
}