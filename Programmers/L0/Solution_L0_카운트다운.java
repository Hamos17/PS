import java.util.Arrays;

public class Solution_L0_카운트다운 {
	public static int[] solution(int start, int end_num) {
		int[] result = new int[start - end_num + 1];
		
		for(int i=0;i<result.length;i++) {
			result[i] = start--;
		}
	
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 3)));
	}
}
