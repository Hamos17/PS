
public class Solution_L0_배열의평균값 {
	public static double solution(int[] numbers) {
		double sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		
		return (sum / numbers.length);
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		System.out.println(solution(new int[] { 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 }));
	}
}