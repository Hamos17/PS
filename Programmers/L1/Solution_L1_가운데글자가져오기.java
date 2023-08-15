
public class Solution_L1_가운데글자가져오기 {
	public static String solution(String s) {
		boolean isEven = s.length() % 2 == 0 ? true : false;
		
		String result = "";
		if(!isEven) {
			result += s.charAt(s.length() / 2);
		}else {
			result = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}
}