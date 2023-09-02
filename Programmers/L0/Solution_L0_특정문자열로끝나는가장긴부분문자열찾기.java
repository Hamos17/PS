
public class Solution_L0_특정문자열로끝나는가장긴부분문자열찾기 {
	public static String solution(String myString, String pat) {
		int idx = myString.lastIndexOf(pat);
        return myString.substring(0, idx + pat.length());
    }
	
	public static void main(String[] args) {
		System.out.println(solution("AbCdEFG", "dE"));
		System.out.println(solution("AAAAaaaa", "a"));
	}
}
