import java.util.Arrays;

public class Solution_L0_뒤에서5등까지 {
	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);

		int[] result = new int[5];
		for(int i=0;i<5;i++) {
			result[i] = num_list[i];
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 12, 4, 15, 46, 38, 1, 14 })));
	}
}
