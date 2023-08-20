
public class Solution_L0_외계행성의나이 {
	public static String solution(int age) {
		String result = "";
		String strAge = String.valueOf(age);

		for(Character ch : strAge.toCharArray()) {
			result += (char)(ch - '0' + 97);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(23));
		System.out.println(solution(51));
		System.out.println(solution(100));
	}
}
