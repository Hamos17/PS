import java.util.Arrays;

public class Solution_L0_배열의원소만큼추가하기 {
	public static int[] solution(int[] arr) {
        int len = 0;
        for(int val : arr) {
        	len += val;
        }
		
        int[] result = new int[len];

        int idx = 0;
        for(int i=0;i<arr.length;i++) {
        	int val = arr[i];
        	for(int j=0;j<arr[i];j++) {
        		result[idx++] = val;
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 5, 1, 4 })));
		System.out.println(Arrays.toString(solution(new int[] { 6, 6 })));
		System.out.println(Arrays.toString(solution(new int[] { 1 })));
	}
}
