
public class Solution_L0_대문자와소문자 {
	 public static String solution(String my_string) {
	        String result = "";
	        for(Character ch : my_string.toCharArray()) {
	        	if('A' <= ch && ch <= 'Z') {
	        		result += (char)(ch + 32);
	        	}else {
	        		result += (char)(ch - 32);
	        	}
	        }
	        
	        return result;
	    }
	 
	 public static void main(String[] args) {
		System.out.println(solution("cccCCC"));
		System.out.println(solution("abCdEfghIJ"));
	}
}
