
public class Solution_L0_양꼬치 {
	public static int solution(int n, int k) {
		int beverage = n / 10;
		return (n * 12000) + (k * 2000) - (beverage * 2000);
    }	
	
	public static void main(String[] args) {
		System.out.println(solution(10, 3));
		System.out.println(solution(64, 6));
	}
}
