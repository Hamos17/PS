import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3003_킹퀸룩비숍나이트폰 {
	private static int[] PIECES = { 1, 1, 2, 2, 2, 8 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] white = new int[6];
		for(int i=0;i<6;i++) {
			white[i] = Integer.parseInt(st.nextToken());
		}
	
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<6;i++) {
			int piece = PIECES[i] - white[i];
			sb.append(piece).append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
