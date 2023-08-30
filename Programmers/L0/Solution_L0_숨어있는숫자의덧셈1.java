
public class Solution_L0_숨어있는숫자의덧셈1 {
	public static int solution(String my_string) {
		int result = 0;
		for(Character ch : my_string.toCharArray()) {
			if('0' <= ch && ch <= '9') {
				result += ch - '0';
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
		System.out.println(solution("1a2b3c4d123"));
	}
}
