
public class Solution_L0_원하는문자열찾기 {
	public static int solution(String myString, String pat) {
		if(myString.toUpperCase().contains(pat.toUpperCase())) return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solution("AbCdEfG", "aBc"));
		System.out.println(solution("aaAA", "aaaaa"));
	}
}
