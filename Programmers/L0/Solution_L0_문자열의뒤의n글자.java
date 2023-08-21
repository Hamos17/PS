
public class Solution_L0_문자열의뒤의n글자 {
	public static String solution(String my_string, int n) {
        String result = "";
		result = my_string.substring(my_string.length() - n);
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("ProgrammerS123", 11));
		System.out.println(solution("He11OWOr1d", 5));
	}
}
