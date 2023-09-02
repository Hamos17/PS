
public class Solution_L0_문자열이몇번등장하는지세기 {
	public static int solution(String myString, String pat) {
		int count = 0;
		for(int i=0;i<myString.length();i++) {
			if(i + pat.length() <= myString.length()) {
				String subStr = myString.substring(i, i + pat.length());
				if(subStr.equals(pat)) {
					count++;
				}
			}
		}
		
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("banana", "ana"));
		System.out.println(solution("aaaa", "aa"));
	}
}
