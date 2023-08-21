
public class Solution_L0_문자열의앞의n글자 {
	public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
	
	public static void main(String[] args) {
		System.out.println(solution("ProgrammerS123", 11));
		System.out.println(solution("He11OWOrld", 5));
	}
}
