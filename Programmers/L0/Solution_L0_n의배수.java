
public class Solution_L0_n의배수 {
	public static int solution(int num, int n) {
		return num % n == 0 ? 1 : 0;
    }

	public static void main(String[] args) {
		System.out.println(solution(98, 2));
		System.out.println(solution(34, 3));
	}
}