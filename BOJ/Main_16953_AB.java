import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_16953_AB {
	public static long bfs(int src, int dest) {
		Queue<long[]> queue = new LinkedList<>();
		queue.offer(new long[] { src, 0 });
		Set<Long> set = new HashSet<>();
		
		long result = Integer.MAX_VALUE;
		
		while(!queue.isEmpty()) {
			long[] poll = queue.poll();
			long cur = poll[0], x = poll[1];
			
			if(cur == dest) {
				result = x;
				break;
			}

			long next1 = cur * 2;
			if(next1 <= (int)(1E9) && !set.contains(next1)) {
				queue.offer(new long[] { next1, x + 1 });
				set.add(next1);
			}
			
			String str = Long.toString(cur) + "1";
			if(Long.parseLong(str) <= (int)(1E9)) {
				long next2 = Integer.parseInt(Long.toString(cur) + "1");
				
				if(!set.contains(next2)) {
					queue.offer(new long[] { next2, x + 1 });
					set.add(next2);
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
	
		long count = bfs(A, B);
		
		if(count == Integer.MAX_VALUE) {
			System.out.print("-1");
		}else {
			System.out.print(count + 1);
		}
	}
}