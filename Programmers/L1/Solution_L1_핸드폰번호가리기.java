
public class Solution_L1_핸드폰번호가리기 {
	public static String solution(String phone_number) {
        String result = "";
        for(int i=0;i<phone_number.length();i++) {
        	if(phone_number.length() - 4 > i) {
        		result += "*";
        	}else {
        		result += phone_number.charAt(i);
        	}
        }

        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
}
