
public class Solution_L0_n보다커질때까지더하기 {
	public static int solution(int[] numbers, int n) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
			
			if(sum > n) {
				break;
			}
		}
	
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 34, 5, 71, 29, 100, 34 }, 123));
		System.out.println(solution(new int[] { 58, 44, 27, 10, 100 }, 139));
	}
}
