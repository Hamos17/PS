import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_1874_스택수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		
		Stack<Integer> stack = new Stack<>();
		int idx = 1;
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int value = Integer.parseInt(st.nextToken());
			
			while(stack.isEmpty() || (!stack.isEmpty() && stack.peek() < value)) {
				stack.push(idx++);
				sb.append("+").append("\n");
			}
			
			if(!stack.isEmpty() && stack.peek() == value) {
				stack.pop();
				sb.append("-").append("\n");
			}else {
				flag = false;
				break;
			}
		}
		
		if(!flag) {
			sb = new StringBuilder();
			sb.append("NO");
		}
		
		System.out.print(sb.toString().trim());
	}
}