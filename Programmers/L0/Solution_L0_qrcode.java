
public class Solution_L0_qrcode {
	public static String solution(int q, int r, String code) {
		String result = "";
		for(int i=0;i<code.length();i++) {
			if(i % q == r) {
				result += code.charAt(i);
			}
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
		System.out.println(solution(1, 0, "programmers"));
	}
}
