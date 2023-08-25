import java.util.Arrays;

public class Solution_L0_2의영역 {
	public static int[] solution(int[] arr) {
        int idx1 = -1, idx2 = -1;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] == 2) {
        		idx1 = i;
        		break;
        	}
        }
        
        if(idx1 == -1) {
        	return new int[] { -1 };
        }
        
        for(int i=idx1+1;i<arr.length;i++) {
        	if(arr[i] == 2) {
        		idx2 = i;
        	}
        }
        
        if(idx2 == -1) {
        	return new int[] { 2 };
        }
        
        int[] result = new int[idx2-idx1+1];
         for(int i=0;i<result.length;i++) {
        	result[i] = arr[idx1++]; 
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 1, 4, 5, 2, 9 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 1, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 1, 2, 1, 10, 2, 1 })));
	}
}
