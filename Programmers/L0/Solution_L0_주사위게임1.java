
public class Solution_L0_주사위게임1 {
	public static int solution(int a, int b) {
		if(a % 2 == 1 && b % 2 == 1) {
			return (a * a) + (b * b);
		}else if(a % 2 == 0 && b % 2 == 0) {
			return Math.abs(a - b);
		}else {
			return 2 * (a + b);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(6, 1));
		System.out.println(solution(2, 4));
	}
}
