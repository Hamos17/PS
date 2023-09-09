
public class Solution_L0_문자열묶기 {
	public static int solution(String[] strArr) {
		int[] lens = new int[31];
		
		int max = 0;
		for(String str : strArr) {
			lens[str.length()]++;
			max = Math.max(max, lens[str.length()]);
		}
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "a", "bc", "d", "efg", "hi" }));
	}
}
