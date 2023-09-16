
public class Solution_L0_암호해독 {
	public static String solution(String cipher, int code) {
        String result = "";
        
        for(int i=code-1;i<cipher.length();i+=code) {
        	result += cipher.charAt(i);
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("dfjardstddetckdaccccdegk", 4));
		System.out.println(solution("pfqallllabwaoclk", 2));
	}
}
