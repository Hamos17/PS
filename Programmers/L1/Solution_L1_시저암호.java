
public class Solution_L1_시저암호 {
	public static String solution(String s, int n) {
		String result = "";
		for(Character ch : s.toCharArray()) {
			if(ch == ' ') {
				result += " ";
				continue;
			}

			char convert = (char)(ch + n);

 			if('A' <= ch && ch <= 'Z') {
 				if(convert > 90) {
 					convert = (char)(convert - 26);
 				}
			}

			
 			if('a' <= ch && ch <= 'z') {
 				if(convert > 122) {
 					convert = (char)(convert - 26);
 				}
			}
			
			result += (char)(convert);
		}
				
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}
}
