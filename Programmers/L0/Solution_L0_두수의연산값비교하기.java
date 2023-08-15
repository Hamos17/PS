
public class Solution_L0_두수의연산값비교하기 {
	public static int solution(int a, int b) {
		String val = String.valueOf(a) + String.valueOf(b);
		
		int result1 = Integer.parseInt(val);
		int result2 = 2 * a * b;
		
		return result1 >= result2 ? result1 : result2;
	}

	public static void main(String[] args) {
		System.out.println(solution(2, 91));
		System.out.println(solution(91, 2));
	}
}