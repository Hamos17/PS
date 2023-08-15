import java.util.Arrays;
import java.util.Stack;

public class Solution_L1_같은숫자는싫어 {
	public static int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for(int value : arr) {
			if(stack.isEmpty()) {
				stack.push(value);
			}else {
				if(stack.peek() == value) {
					continue;
				}else {
					stack.push(value);
				}
			}
		}

		int[] result = new int[stack.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = stack.get(i);
		}
		
        return result;
    }

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 1, 3, 3, 0, 1, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 4, 4, 4, 3, 3 })));
	}
}
