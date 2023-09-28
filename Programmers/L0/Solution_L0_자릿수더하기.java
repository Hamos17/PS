
public class Solution_L0_자릿수더하기 {
	public static int solution(int n) {
		String strNum = String.valueOf(n);

		int result = 0;
		for(Character ch : strNum.toCharArray()) {
			result += ch - '0';
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(1234));
		System.out.println(solution(930211));
	}
}
