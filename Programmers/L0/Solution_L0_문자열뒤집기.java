
public class Solution_L0_문자열뒤집기 {
	public static String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		sb.append(my_string);

		return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		System.out.println(solution("jaron"));
		System.out.println(solution("bread"));
	}
}
