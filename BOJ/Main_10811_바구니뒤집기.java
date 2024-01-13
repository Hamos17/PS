import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_10811_바구니뒤집기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[] basket = new int[N];
		for(int i=0;i<N;i++) {
			basket[i] = (i + 1);
		}
		
		for(int m=0;m<M;m++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;

			List<Integer> list = new ArrayList<>();
			for(int x=j;i<=x;x--) {
				list.add(basket[x]);
			}
			
			int idx = 0;
			for(int x=i;x<=j;x++) {
				basket[x] = list.get(idx++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(basket[i]).append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
