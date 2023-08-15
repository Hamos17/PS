import java.util.HashSet;

public class Solution_L1_폰켓몬 {
	public static int solution(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<>();
		for(int num : nums) {
			hashSet.add(num);

			if((nums.length / 2) == hashSet.size()) {
				break;
			}
		}
	
		return hashSet.size();
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 1, 2, 3 }));
		System.out.println(solution(new int[] { 3, 3, 3, 2, 2, 4 }));
		System.out.println(solution(new int[] { 3, 3, 3, 2, 2, 2 }));
	}
}