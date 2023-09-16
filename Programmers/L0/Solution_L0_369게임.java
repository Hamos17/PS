
public class Solution_L0_369게임 {
	public static int solution(int order) {
		String str = Integer.toString(order);
		
		int clap = 0;
		for(Character ch : str.toCharArray()) {
			if(ch == '3' || ch == '6' || ch == '9') {
				clap++;
			}
		} 
		
        return clap;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(29423));
	}
}
