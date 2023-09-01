import java.util.Arrays;

public class Solution_L1_x만큼간격이있는n개의숫자 {
	public static long[] solution(int x, int n) {
		long[] result = new long[n];
		
		long interval = x;
		for(int i=0;i<n;i++) {
			result[i] = interval;
			interval += x;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
		System.out.println(Arrays.toString(solution(4, 3)));
		System.out.println(Arrays.toString(solution(-4, 2)));
	}
}
