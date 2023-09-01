
public class Solution_L0_소문자로바꾸기 {
	public static String solution(String myString) {
        return myString.toLowerCase();
    }
	
	public static void main(String[] args) {
		System.out.println(solution("aBcDeFg"));
		System.out.println(solution("aaa"));
	}
}
