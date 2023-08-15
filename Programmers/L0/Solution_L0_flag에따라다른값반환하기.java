
public class Solution_L0_flag에따라다른값반환하기 {
	public static int solution(int a, int b, boolean flag) {
		if(flag) return (a + b);

		return (a - b);
	}
	
	public static void main(String[] args) {
		System.out.println(solution(-4, 7, true));
		System.out.println(solution(-4, 7, false));
	}
}