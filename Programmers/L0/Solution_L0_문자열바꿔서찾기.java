
public class Solution_L0_문자열바꿔서찾기 {
	public static int solution(String myString, String pat) {
		String str = "";
		for(Character ch : myString.toCharArray()) {
			if(ch == 'A') str += "B";
			else str += "A";
		}
		
		if(str.contains(pat)) return 1;
		return 0;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("ABBAA", "AABB"));
		System.out.println(solution("ABAB", "ABAB"));
	}
}
