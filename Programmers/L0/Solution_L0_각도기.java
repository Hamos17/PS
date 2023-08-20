
public class Solution_L0_각도기 {
	public static int solution(int angle) {
		if(0 < angle && angle < 90) {
			return 1;
		}else if(angle == 90) {
			return 2;
		}else if(90 < angle && angle < 180) {
			return 3;
		}else {
			return 4;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(solution(70));
		System.out.println(solution(91));
		System.out.println(solution(180));
	}
}
