import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10813_공바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[] basket = new int[N+1];
		for(int i=1;i<=N;i++) {
			basket[i] = i;
		}
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(basket[i]).append(" ");
		}
		
		System.out.print(sb.toString().trim());
	}
}