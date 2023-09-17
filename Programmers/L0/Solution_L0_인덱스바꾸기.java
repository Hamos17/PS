
public class Solution_L0_인덱스바꾸기 {
	public static String solution(String my_string, int num1, int num2) {
		String[] splits = my_string.split("");

		String temp = "";
		temp = splits[num1];
		splits[num1] = splits[num2];
		splits[num2] = temp;

		String result = "";
		for(String split : splits) {
			result += split;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution("hello", 1, 2));
		System.out.println(solution("I love you", 3, 6));
	}
}
