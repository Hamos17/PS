import java.util.Arrays;

public class Solution_L0_n번째원소부터 {
	public static int[] solution(int[] num_list, int n) {
		int[] result = new int[num_list.length - (n - 1)];
	
		int idx = (n - 1);
		for(int i=0;i<result.length;i++) {
			result[i] = num_list[idx++]; 
		}

		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 2, 1, 6 }, 3)));
		System.out.println(Arrays.toString(solution(new int[] { 5, 2, 1, 7, 5 }, 2)));
	}
}
