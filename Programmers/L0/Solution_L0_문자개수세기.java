import java.util.Arrays;

public class Solution_L0_문자개수세기 {
	public static int[] solution(String my_string) {
		int[] counts = new int[52];
		
		for(Character ch : my_string.toCharArray()) {
			if('A' <= ch && ch <= 'Z') {
				counts[ch - 65]++;
			}else {
				counts[ch - 97 + 26]++;
			}
		}
		
        return counts;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("Programmers")));
	}
}
