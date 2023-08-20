
public class Solution_L1_서울에서김서방찾기 {
	public static String solution(String[] seoul) {
		int idx = -1;
		for(int i=0;i<seoul.length;i++) {
			if("Kim".equals(seoul[i])) {
				idx = i;
				break;
			}
		}
		
		return "김서방은 " + idx + "에 있다" ;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new String[] { "Jane", "Kim" }));
	}
}
