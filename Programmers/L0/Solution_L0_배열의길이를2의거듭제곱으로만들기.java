import java.util.Arrays;

public class Solution_L0_배열의길이를2의거듭제곱으로만들기 {
	public static int[] solution(int[] arr) {
		int len = arr.length;
		
		for(int i=0;i<=10;i++) {
			int pow = (int)Math.pow(2, i);

			if(len == pow) {
				return arr;
			}
		}
		
		int count = 0;
		for(int i=0;i<=10;i++) {
			int pow = (int)Math.pow(2, i);

			if(len < pow) {
				count = pow - len;
				break;
			}
		}
		
		int[] result = new int[len + count];
		for(int i=0;i<arr.length;i++) {
			result[i] = arr[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5, 6 })));
		System.out.println(Arrays.toString(solution(new int[] { 58, 172, 746, 89 })));
		System.out.println(Arrays.toString(solution(new int[] { 1 })));
	}
}
