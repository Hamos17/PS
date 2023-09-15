import java.util.Arrays;

public class Solution_L0_조건에맞게수열변환하기3 {
	public static int[] solution(int[] arr, int k) {
        if(k % 2 == 1) {
        	for(int i=0;i<arr.length;i++) {
        		arr[i] *= k;
        	}
        }else {
        	for(int i=0;i<arr.length;i++) {
        		arr[i] += k;
        	}
        }
		
        return arr;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 100, 99, 98 }, 3)));
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 100, 99, 98 }, 2)));
	}
}
