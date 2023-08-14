
public class Solution_L0_문자열겹쳐쓰기 {
	public static String solution(String my_string, String overwrite_string, int s) {
		String subStr1 = my_string.substring(0, s);
		String subStr2 = my_string.substring(s + overwrite_string.length());
		
		return subStr1 + overwrite_string + subStr2;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
		System.out.println(solution("Program29b8UYP", "merS123", 7));
	}
}