
public class Solution_L0_부분문자열이어붙여문자열만들기 {
	public static String solution(String[] my_strings, int[][] parts) {
        String result = "";
		for(int i=0;i<parts.length;i++) {
			int[] part = parts[i];
			int s = part[0], e = part[1];
	
			result += my_strings[i].substring(s, e + 1);
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new String[] { "progressive", "hamburger", "hammer", "ahocorasick" }, new int[][] { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } }));
	}
}
