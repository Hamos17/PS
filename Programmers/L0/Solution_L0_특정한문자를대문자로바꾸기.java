
public class Solution_L0_특정한문자를대문자로바꾸기 {
	public static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
	
	public static void main(String[] args) {
		System.out.println(solution("programmers", "p"));
		System.out.println(solution("lowercase", "x"));
	}
}
