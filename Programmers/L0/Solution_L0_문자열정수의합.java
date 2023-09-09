
public class Solution_L0_문자열정수의합 {
	public static int solution(String num_str) {
		int result = 0;
		for(Character ch : num_str.toCharArray()) {
			result += ch - '0';
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("123456789"));
		System.out.println(solution("1000000"));
	}
}
