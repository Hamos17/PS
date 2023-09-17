
public class Solution_L0_배열의유사도 {
	public static int solution(String[] s1, String[] s2) {
		int count = 0;
		for(int i=0;i<s1.length;i++) {
			for(String word : s2) {
				if(word.equals(s1[i])) {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "a", "b", "c" }, new String[] { "com", "b", "d", "p", "c" }));
		System.out.println(solution(new String[] { "n", "omg" }, new String[] { "m", "dot" }));
	}
}
