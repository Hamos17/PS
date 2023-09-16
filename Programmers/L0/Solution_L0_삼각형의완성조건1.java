import java.util.Arrays;

public class Solution_L0_삼각형의완성조건1 {
	public static int solution(int[] sides) {
		Arrays.sort(sides);
		return sides[0] + sides[1] > sides[2] ? 1 : 2;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3 }));
		System.out.println(solution(new int[] { 3, 6, 2 }));
		System.out.println(solution(new int[] { 199, 72, 222 }));
	}
}
