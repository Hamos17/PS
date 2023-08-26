import java.util.Arrays;

public class Solution_L0_배열회전시키기 {
	public static int[] solution(int[] numbers, String direction) {
		int[] result = new int[numbers.length];
		
		if("left".equals(direction)) {
			result[result.length - 1] = numbers[0];
			for(int i=0;i<result.length-1;i++) {
				result[i] = numbers[i+1];
			}
		}else {
			result[0] = numbers[numbers.length-1];
			for(int i=1;i<result.length;i++) {
				result[i] = numbers[i-1];
			}
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3 }, "right")));
		System.out.println(Arrays.toString(solution(new int[] { 4, 455, 6, 4, -1, 45, 6 }, "left")));
	}
}
