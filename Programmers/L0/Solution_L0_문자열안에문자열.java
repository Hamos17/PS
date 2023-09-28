
public class Solution_L0_문자열안에문자열 {
	public static int solution(String str1, String str2) {
		return str1.contains(str2) == true ? 1 : 2;
	}

	public static void main(String[] args) {
		System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
		System.out.println(solution("ppprrrogrammers", "pppp"));
		System.out.println(solution("AbcAbcA", "AAA"));
	}
}
