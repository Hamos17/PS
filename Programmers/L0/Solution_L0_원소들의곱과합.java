
public class Solution_L0_원소들의곱과합 {
	public static int solution(int[] num_list) {
		int value1 = 1;
		int value2 = 0;

		for(int num : num_list) {
			value1 *= num;
			value2 += num;
		}
		
		value2 = (int) Math.pow(value2, 2);
		
		return value1 < value2 ? 1 : 0;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 4, 5, 2, 1 }));
		System.out.println(solution(new int[] { 5, 7, 8, 3 }));
	}
}