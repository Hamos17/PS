import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_무작위로K개의수뽑기 {
	public static int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int val : arr) {
        	if(!list.contains(val)) {
        		list.add(val);
        	}
        }
		
        int size = list.size();
        int[] result = new int[k];
        
        for(int i=0;i<k;i++) {
        	if(i < size) {
        		result[i] = list.get(i);
        	}else {
        		result[i] = -1;
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 1, 2, 2, 3 }, 3)));
		System.out.println(Arrays.toString(solution(new int[] { 0, 1, 1, 1, 1 }, 4)));
	}
}
