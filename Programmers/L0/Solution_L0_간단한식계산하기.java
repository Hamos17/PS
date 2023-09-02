
public class Solution_L0_간단한식계산하기 {
	public static int solution(String binomial) {
		String[] splits = binomial.split(" ");
		int a = Integer.parseInt(splits[0]);
		int b = Integer.parseInt(splits[2]);

		int result = 0;
		switch (splits[1]) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("43 + 12"));
		System.out.println(solution("0 - 7777"));
		System.out.println(solution("40000 * 40000"));
	}
}
