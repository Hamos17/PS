import java.util.Arrays;

public class Solution_L0_n번째원소까지 {
	public static int[] solution(int[] num_list, int n) {
		int[] result = new int[n];
		for(int i=0;i<result.length;i++) {
			result[i] = num_list[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 2, 1, 6 }, 1)));
		System.out.println(Arrays.toString(solution(new int[] { 5, 2, 1, 7, 5 }, 3)));
	}
}
