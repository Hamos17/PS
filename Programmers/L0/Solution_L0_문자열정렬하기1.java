import java.util.Arrays;

public class Solution_L0_문자열정렬하기1 {
	public static int[] solution(String my_string) {
		char[] arr = my_string.toCharArray();
		Arrays.sort(arr);
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if('0' <= arr[i] && arr[i] <= '9') {
				count++;
			}
		}
		
		int[] result = new int[count];
		for(int i=0;i<count;i++) {
			result[i] = arr[i] - '0';
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("hi12392")));
		System.out.println(Arrays.toString(solution("p2o4i8gj2")));
		System.out.println(Arrays.toString(solution("abcde0")));
	}
}
