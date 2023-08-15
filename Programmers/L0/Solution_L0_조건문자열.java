
public class Solution_L0_조건문자열 {
	public static int solution(String ineq, String eq, int n, int m) {
		if(">".equals(ineq)) {
			if("=".equals(eq)) {
				if(n >= m) return 1;
				else return 0;
			}else {
				if(n > m) return 1;
				else return 0;
			}
		}else {
			if("=".equals(eq)) {
				if(n <= m) return 1;
				else return 0;
			}else {
				if(n < m) return 1;
				else return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution("<", "=", 20, 50));
		System.out.println(solution(">", "!", 41, 78));
	}
}