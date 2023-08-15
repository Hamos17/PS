
public class Solution_L0_피자나눠먹기3 {
	public static int solution(int slice, int n) {
		return (n % slice) == 0 ? (n / slice) : (n / slice) + 1; 
	}
	
	public static void main(String[] args) {
		System.out.println(solution(7, 10));
		System.out.println(solution(4, 12));
	}
}