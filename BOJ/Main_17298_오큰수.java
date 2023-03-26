import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17298_오큰수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] NGE = new int[N];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=N-1;0<=i;i--) {
			if(stack.isEmpty()) {
				stack.push(A[i]);
				NGE[i] = -1;
				
				continue;
			}
			
			while(!stack.isEmpty() && A[i] >= stack.peek()) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				NGE[i] = -1;
			}else {
				NGE[i] = stack.peek();
			}

			stack.push(A[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int value : NGE) {
			sb.append(value).append(" ");
		}
		
		System.out.print(sb.toString().trim());
	}
}