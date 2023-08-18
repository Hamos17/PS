import java.util.Arrays;

public class Solution_L1_문자열내림차순으로배치하기 {
	public static String solution(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		String result = "";
		for(char ch : arr) {
			result += ch;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(result);
		
        return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
}
