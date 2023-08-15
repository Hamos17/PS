
public class Solution_L0_수조작하기2 {
	public static String solution(int[] numLog) {
		String result = "";
		for(int i=0;i<numLog.length - 1;i++) {
			if(numLog[i+1] - numLog[i] == 1) {
				result += "w";
			}else if(numLog[i+1] - numLog[i] == -1) {
				result += "s";
			}else if(numLog[i+1] - numLog[i] == 10) {
				result += "d";
			}else {
				result += "a";
			}
		}
	
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 }));
	}
}