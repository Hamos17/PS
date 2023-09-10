
public class Solution_L0_0떼기 {
	public static String solution(String n_str) {
		int idx = -1;
		
		for(int i=0;i<n_str.length();i++) {
			char ch = n_str.charAt(i);
			
			if(ch == '0') {
				idx = i;
			}else {
				break;
			}
		}
		
		if(idx == -1) {
			return n_str;
		}else {
			return n_str.substring(idx + 1);
		}
    }
	
	public static void main(String[] args) {
		System.out.println(solution("0010"));
		System.out.println(solution("854020"));
	}
}
