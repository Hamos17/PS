import java.util.Arrays;

public class Solution_L0_배열원소의길이 {
	public static int[] solution(String[] strlist) {
		int[] lens = new int[strlist.length];
		
		for(int i=0;i<lens.length;i++) {
			lens[i] = strlist[i].length();
		}

		return lens;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "We", "are", "the", "world!" })));
		System.out.println(Arrays.toString(solution(new String[] { "I", "Love", "Programmers." })));
	}
}
