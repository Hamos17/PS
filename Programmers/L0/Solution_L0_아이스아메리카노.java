import java.util.Arrays;

public class Solution_L0_아이스아메리카노 {
	public static int[] solution(int money) {
		int coffee = money / 5500;
		int change = money % 5500;
		
		return new int[] { coffee, change };
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5500)));
		System.out.println(Arrays.toString(solution(15000)));
	}
}