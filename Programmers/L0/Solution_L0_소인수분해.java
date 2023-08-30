import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_소인수분해 {
	public static int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		
		int prime = 2;
		while(n != 1) {
			if(n % prime == 0) {
				n /= prime;
				
				if(!list.contains(prime)) {
					list.add(prime);
				}
				
			}else {
				prime++;
			}
		}
		
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		} 
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12)));
		System.out.println(Arrays.toString(solution(17)));
		System.out.println(Arrays.toString(solution(420)));
	}
}
