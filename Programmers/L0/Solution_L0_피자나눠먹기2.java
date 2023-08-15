
public class Solution_L0_피자나눠먹기2 {
	public static int solution(int n) {
		int pizza = 1;
		while(true) {
			if((pizza * 6) % n == 0) {
				break;
			}
			
			pizza++;
		}
		
		return pizza;
	}

	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(10));
		System.out.println(solution(4));
	}
}