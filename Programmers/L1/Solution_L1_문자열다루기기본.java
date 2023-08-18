
public class Solution_L1_문자열다루기기본 {
	public static boolean solution(String s) {
		if(s.length() != 4 && s.length() != 6) {
			return false;
		}else {
			for(Character ch : s.toCharArray()) {
				if('0' > ch || ch > '9') {
					return false;
				}
			}
		}

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
}
