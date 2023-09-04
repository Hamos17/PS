
public class Solution_L0_배열비교하기 {
	public static int solution(int[] arr1, int[] arr2) {
		int len1 = arr1.length, len2 = arr2.length;
		if(len1 != len2) {
			return len1 > len2 ? 1 : -1;
		}
		
		int sum1 = 0, sum2 = 0;
		for(int val : arr1) {
			sum1 += val;
		}
		
		for(int val : arr2) {
			sum2 += val;
		}
		
		if(sum1 > sum2) {
			return 1;
		}else if(sum1 < sum2) {
			return -1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 49, 13 }, new int[] { 70, 11, 2 }));
		System.out.println(solution(new int[] { 100, 17, 84, 1 }, new int[] { 55, 12, 65, 36 }));
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 3, 3, 3, 3 }));
	}
}
