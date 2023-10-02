
public class Solution_L0_유한소수판별하기 {
	public static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return GCD(b, a % b);
		}
	}

	public static int solution(int a, int b) {
		int numB = b / GCD(a, b);

		while(numB != 1) {
			if(numB % 2 == 0) {
				numB /= 2;
			}else if(numB % 5 == 0) {
				numB /= 5;
			}else {
				return 2;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		System.out.println(solution(7, 20));
		System.out.println(solution(11, 22));
		System.out.println(solution(12, 21));
	}
}
