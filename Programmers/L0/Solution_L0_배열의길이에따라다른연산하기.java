import java.util.Arrays;

public class Solution_L0_배열의길이에따라다른연산하기 {
	public static int[] solution(int[] arr, int n) {
		int len = arr.length;
		
		if(len % 2 == 1) {
			for(int i=0;i<arr.length;i+=2) {
				arr[i] += n;
			}
		}else {
			for(int i=1;i<arr.length;i+=2) {
				arr[i] += n;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 49, 12, 100, 276, 33 }, 27)));
		System.out.println(Arrays.toString(solution(new int[] { 444, 555, 666, 777 }, 100)));
	}
}
