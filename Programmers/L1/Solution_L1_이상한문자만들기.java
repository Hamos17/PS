
public class Solution_L1_이상한문자만들기 {
	public static String solution(String s) {
		char[] words = s.toUpperCase().toCharArray();
		
		int idx = 0;
		for(int i=0;i<words.length;i++) {
			if((65 <= words[i] && words[i] <= 90) && (idx % 2 == 0)) {
				idx++;
			}else if((65 <= words[i] && words[i] <= 90) && (idx % 2 == 1)) {
				words[i] += 32;
				idx++;
			}else {
				idx = 0;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char ch : words) {
			sb.append(ch);
		}
		
		return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(solution("try heelo world"));
		System.out.println(solution(" try heelo world"));
	}
}
