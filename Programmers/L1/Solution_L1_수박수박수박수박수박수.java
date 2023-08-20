
public class Solution_L1_수박수박수박수박수박수 {
	public static String solution(int n) {
		String result = "";
		for(int i=1;i<=n;i++) {
			if(i % 2 == 1) result += "수";
			else result += "박";
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
}
