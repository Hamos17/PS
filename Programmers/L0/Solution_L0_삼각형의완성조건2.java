import java.util.Arrays;

public class Solution_L0_삼각형의완성조건2 {
	public static int solution(int[] sides) {
		Arrays.sort(sides);

		int count = 0;
		for(int i=1;i<sides[1];i++) {
			if(sides[1] < sides[0] + i) {
				count++;
			}
		}

		for(int i=sides[1];;i++) {
			if(i < sides[0] + sides[1]) {
				count++;
			}else {
				break;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2 }));
		System.out.println(solution(new int[] { 3, 6 }));
		System.out.println(solution(new int[] { 11, 7 }));
	}
}
