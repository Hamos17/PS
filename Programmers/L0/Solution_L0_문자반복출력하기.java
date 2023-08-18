
public class Solution_L0_문자반복출력하기 {
	public static String solution(String my_string, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<my_string.length();i++) {
			char ch = my_string.charAt(i);
			
			for(int j=0;j<n;j++) {
				sb.append(ch);
			}
		}
	
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(solution("hello", 3));
	}
}