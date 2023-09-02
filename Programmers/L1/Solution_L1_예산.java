import java.util.Arrays;

public class Solution_L1_예산 {
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);
		
		int sum = 0, count = 0;
		for(int i=0;i<d.length;i++) {
			if(sum + d[i] <= budget) {
				sum += d[i];
				count++;
			}
		}
	
		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 2, 5, 4 }, 9));
		System.out.println(solution(new int[] { 2, 2, 3, 3 }, 10));
	}
}
