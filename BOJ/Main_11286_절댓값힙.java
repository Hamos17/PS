import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_11286_절댓값힙 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer v1, Integer v2) {
				if(Math.abs(v1) < Math.abs(v2)) {
					return -1;
				}else if(Math.abs(v1) == Math.abs(v2)) {
					if(v1 < v2) {
						return -1;
					}
				}
			
				return 1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int X = Integer.parseInt(st.nextToken());
			
			if(X != 0) {
				pq.offer(X);
			}else {
				if(!pq.isEmpty()) {
					sb.append(pq.poll()).append("\n");
				}else {
					sb.append("0").append("\n");
				}
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}