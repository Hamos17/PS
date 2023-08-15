
public class Solution_L0_최빈값구하기 {
	public static int solution(int[] array) {
		int[] count = new int[1001];
		for(int value : array) {
			count[value]++;
		}
		
		int idx = -1, max = -1;
		for(int i=0;i<1001;i++) {
			if(count[i] > max) {
				max = count[i];
				idx = i;
			}
		}
		
		boolean isMany = false;
		for(int i=0;i<1001;i++) {
			if(i != idx && max == count[i]) {
				isMany = true;
				break;
			}
		}
		
		return isMany == true ? -1 : idx;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 3, 3, 4 }));
		System.out.println(solution(new int[] { 1, 1, 2, 2 }));
	}
}