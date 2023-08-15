
public class Solution_L0_등차수열의특정한항만더하기 {
	public static int solution(int a, int d, boolean[] included) {
		int result = 0;
		for(int i=0;i<included.length;i++) {
			int value = a + (d * i);
			
			if(included[i]) {
				result += value;
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3, 4, new boolean[] { true, false, false, true, true }));
		System.out.println(solution(7, 1, new boolean[] { false, false, false, true, false, false, false }));
	}
}