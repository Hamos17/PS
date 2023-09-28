
public class Solution_L0_제곱수판별하기 {
	public static int solution(int n) {
        int num = (int)Math.sqrt(n);
        return (num * num) == n ? 1 : 2;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(144));
		System.out.println(solution(976));
	}
}
