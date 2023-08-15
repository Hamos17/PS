
public class Solution_L0_문자열곱하기 {
	public static String solution(String my_string, int k) {
		String result = "";
		while(k-- > 0) {
			result += my_string;
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("string", 3));
		System.out.println(solution("love", 10));
	}
}