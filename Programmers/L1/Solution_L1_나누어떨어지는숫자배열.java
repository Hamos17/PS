import java.util.Arrays;

public class Solution_L1_나누어떨어지는숫자배열 {
	public static int[] solution(int[] arr, int divisor) {
		int count = 0;
		for(int value : arr) {
			if(value % divisor == 0) {
				count++;
			}
		}

		if(count == 0) {
			return new int[] { -1 };
		}else {
			int[] result = new int[count];
			int idx = 0;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i] % divisor == 0) {
					result[idx++] = arr[i];
				}
			}

			Arrays.sort(result);
			
			return result;
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 5, 9, 7, 10 }, 5)));
		System.out.println(Arrays.toString(solution(new int[] { 2, 36, 1, 3 }, 1)));
		System.out.println(Arrays.toString(solution(new int[] { 3, 2, 6 }, 10)));
	}
}