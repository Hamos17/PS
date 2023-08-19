import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_콜라츠수열만들기 {
	public static int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		
		list.add(n);
		while(n != 1){
			if(n % 2 == 0) n /= 2;
			else n = (3 * n) + 1;
			
			list.add(n);
		}

		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10)));
	}
}
