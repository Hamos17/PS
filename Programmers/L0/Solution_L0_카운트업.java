import java.util.Arrays;

public class Solution_L0_카운트업 {
	public static int[] solution(int start, int end) {
		int len = (end - start + 1);
		int[] result = new int[len];
		
		for(int i=0;i<result.length;i++) {
			result[i] = start++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 10)));
	}
}
