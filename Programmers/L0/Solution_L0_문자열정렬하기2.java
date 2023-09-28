import java.util.Arrays;

public class Solution_L0_문자열정렬하기2 {
	public static String solution(String my_string) {
		char[] arr = my_string.toLowerCase().toCharArray();
		Arrays.sort(arr);

		String result = "";
		for(Character ch : arr) {
			result += ch;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution("Bcad"));
		System.out.println(solution("heLLo"));
		System.out.println(solution("Python"));
	}
}
