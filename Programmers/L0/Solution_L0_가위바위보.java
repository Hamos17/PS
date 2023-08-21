import java.util.HashMap;

public class Solution_L0_가위바위보 {
	public static String solution(String rsp) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("2", "0"); hashMap.put("0", "5"); hashMap.put("5", "2");
		
        String result = "";
        String[] inputs = rsp.split("");
        for(String input : inputs) {
        	result += hashMap.get(input);
        }

        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("2"));
		System.out.println(solution("205"));
	}
}
