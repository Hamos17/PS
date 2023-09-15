
public class Solution_L0_l로만들기 {
	public static String solution(String myString) {
        String result = "";
        for(Character ch : myString.toCharArray()) {
        	if(ch < 'l') {
        		result += "l";
        	}else {
        		result += ch;
        	}
        }

        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("abcdevwxyz"));
		System.out.println(solution("jjnnllkkmm"));
	}
}
