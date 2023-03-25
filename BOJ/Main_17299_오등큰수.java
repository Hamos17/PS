import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17299_오등큰수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		int[] counts = new int[1000001];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			counts[arr[i]]++;
		}
		
		Stack<int[]> stack = new Stack<>();
		int[] result = new int[N];
		for(int i=N-1;0<=i;i--) {
			int value = arr[i];
			int count = counts[arr[i]];

			if(stack.isEmpty()) {
				result[i] = -1;
				stack.push(new int[] { value, count });
				
				continue;
			}
			
			while(!stack.isEmpty() && stack.peek()[1] <= count) {
				stack.pop();
			}
			
			if(!stack.isEmpty()) {
				result[i] = stack.peek()[0];
			}else {
				result[i] = -1;
			}
			
			stack.push(new int[] { value, count });
		}
		
		StringBuilder sb = new StringBuilder();
		for(int res : result) {
			sb.append(res).append(" ");
		}
		
		System.out.print(sb.toString().trim());
	}
}