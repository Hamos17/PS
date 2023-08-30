
public class Solution_L0_홀수vs짝수 {
	public static int solution(int[] num_list) {
		int odd = 0, even = 0;
		for(int i=0;i<num_list.length;i++) {
			if(i % 2 == 0) odd += num_list[i];
			else even += num_list[i];
		}
		
        return odd >= even ? odd : even;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 4, 2, 6, 1, 7, 6 }));
		System.out.println(solution(new int[] { -1, 2, 5, 6, 3}));
	}
}
