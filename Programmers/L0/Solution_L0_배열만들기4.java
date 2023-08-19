import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_배열만들기4 {
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		
		int i = 0;
		while(i < arr.length) {
			if(list.isEmpty()) {
 				list.add(arr[i]);
 				i++;
			}else {
				int last = list.get(list.size() - 1);
				
				if(last < arr[i]) {
					list.add(arr[i]);
					i++;
				}else {
					list.remove(list.size() - 1);
				}
			}
		}
		
        int[] stk = new int[list.size()];
        for(int k=0;k<stk.length;k++) {
        	stk[k] = list.get(k); 
        }
        
        return stk;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 4, 2, 5, 3 })));
	}
}
