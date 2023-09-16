import java.util.Arrays;

public class Solution_L0_가까운수 {
	public static int solution(int[] array, int n) {
		Arrays.sort(array);
		
		int diff = Integer.MAX_VALUE;
		int result = Integer.MAX_VALUE;
		
		for(int val : array) {
			if(Math.abs(n - val) < diff) {
				diff = Math.min(diff, Math.abs(n - val));
				result = val;
			}
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 10, 28 }, 20));
		System.out.println(solution(new int[] { 10, 11, 12 }, 13));
	}
}
