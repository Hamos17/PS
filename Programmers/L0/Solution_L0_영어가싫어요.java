
public class Solution_L0_영어가싫어요 {
	private static final String[] DIGITS = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public static long solution(String numbers) {
		for(int i=0;i<DIGITS.length;i++) {
			String digit = DIGITS[i];
			numbers = numbers.replaceAll(digit, String.valueOf(i));
		}

		return Long.parseLong(numbers);
	}

	public static void main(String[] args) {
		System.out.println(solution("onetwothreefourfivesixseveneightnine"));
		System.out.println(solution("onefourzerosixseven"));
	}
}
