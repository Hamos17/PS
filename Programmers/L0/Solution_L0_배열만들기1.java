import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_배열만들기1 {
	public static int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) {
        	if(i % k == 0) {
        		list.add(i);
        	}
        }
		
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++) {
        	result[i] = list.get(i);
        }

        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 3)));
		System.out.println(Arrays.toString(solution(15, 5)));
	}
}
