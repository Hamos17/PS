import java.util.Arrays;

public class Solution_L0_가장큰수찾기 {
	public static int[] solution(int[] array) {
		int[] result = new int[2];

		int idx = -1, max = -1;
		for(int i=0;i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
				idx = i;
			}
		}

		result[0] = max;
		result[1] = idx;

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 8, 3 })));
		System.out.println(Arrays.toString(solution(new int[] { 9, 10, 11, 8 })));
	}
}
