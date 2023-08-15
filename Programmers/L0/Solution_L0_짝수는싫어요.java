import java.util.Arrays;

public class Solution_L0_짝수는싫어요 {
	public static int[] solution(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(i % 2 == 1) {
				count++;
			}
		}
		
		int[] result = new int[count];
		int idx = 0;
		
		for(int i=1;i<=n;i++) {
			if(i % 2 == 1) {
				result[idx++] = i;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10)));
		System.out.println(Arrays.toString(solution(15)));
	}
}