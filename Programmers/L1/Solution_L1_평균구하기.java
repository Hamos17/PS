
public class Solution_L1_평균구하기 {
	public static double solution(int[] arr) {
		double sum = 0.0;
		for(int val : arr) {
			sum += val;
		}
		
		double avg = sum / arr.length;
        return avg;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(solution(new int[] { 5, 5 }));
	}
}
