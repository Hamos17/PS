
public class Solution_L0_대문자로바꾸기 {
	public static String solution(String myString) {
		return myString.toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println(solution("aBcDeFg"));
		System.out.println(solution("AAA"));
	}
}
