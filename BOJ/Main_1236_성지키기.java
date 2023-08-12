import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1236_성지키기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		char[][] castle = new char[N][M];
		for(int i=0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<M;j++) {
				castle[i][j] = line.charAt(j);
			}
		}
		
		int row = 0, col = 0;
		
		// 행 검사
		for(int i=0;i<N;i++) {
			int count = 0;
			for(int j=0;j<M;j++) {
				if(castle[i][j] == '.') {
					count++;
				}
			}
			
			if(count == M) {
				row++;
			}
		}
		
		// 열 검사
		for(int j=0;j<M;j++) {
			int count = 0;
			for(int i=0;i<N;i++) {
				if(castle[i][j] == '.') {
					count++;
				}
			}
			
			if(count == N) {
				col++;
			}
		}

		int guard = row >= col ? row : col;
		System.out.print(guard);
	}
}