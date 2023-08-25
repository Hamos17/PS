
public class Solution_L0_글자지우기 {
	public static String solution(String my_string, int[] indices) {
		boolean[] idxs = new boolean[my_string.length()];
		
		for(int indice : indices) {
			idxs[indice] = true;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<my_string.length();i++) {
			if(!idxs[i]) {
				sb.append(my_string.charAt(i));
			}
		}

		return sb.toString().trim();
    }
	
	public static void main(String[] args) {
		System.out.println(solution("apporoograpemmemprs", new int[] { 1, 16, 6, 15, 0, 10, 11, 3 }));
	}
}
