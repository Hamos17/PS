
public class Solution_L0_모음제거 {
	public static String solution(String my_string) {
        String result = "";
        for(Character ch : my_string.toCharArray()) {
        	if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
        		result += ch;
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("bus"));
		System.out.println(solution("nice to meet you"));
	}
}
