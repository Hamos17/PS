import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10811_바구니뒤집기 {
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
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			Stack<Integer> stack = new Stack<>();
			for(int i=start;i<=end;i++) {
				stack.push(basket[i]);
			}
			
			for(int i=start;i<=end;i++) {
				basket[i] = stack.pop();
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(basket[i]).append(" ");
		}
		
		System.out.print(sb.toString().trim());
	}
}