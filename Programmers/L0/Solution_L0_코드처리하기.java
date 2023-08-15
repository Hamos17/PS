
public class Solution_L0_코드처리하기 {
	public static String solution(String code) {
        String ret = "";
        int mode = 0;

        for(int i=0;i<code.length();i++) {
        	if(mode == 0) {
        		if(code.charAt(i) != '1') {
        			if(i % 2 == 0) {
        				ret += code.charAt(i);
        			}
        		}else {
        			mode = 1;
        		}
        	}else {
        		if(code.charAt(i) != '1') {
        			if(i % 2 == 1) {
        				ret += code.charAt(i);
        			}
        		}else {
        			mode = 0;
        		}
        	}
        }
        
        return ret.length() != 0 ? ret : "EMPTY";
    }
	
	public static void main(String[] args) {
		System.out.println(solution("abc1abc1abc"));
	}
}