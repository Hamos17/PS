import java.util.Arrays;

public class Solution_L0_배열의원소삭제하기 {
	public static int[] solution(int[] arr, int[] delete_list) {
		int deleteCount = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<delete_list.length;j++) {
				int delete = delete_list[j];
			
				if(arr[i] == delete) {
					arr[i] = -1;
					deleteCount++;

					break;
				}
			}
		}
		
		if(deleteCount == 0) {
			return arr;
		}else {
			int[] result = new int[arr.length - deleteCount];
			
			int idx = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] != -1) {
					result[idx++] = arr[i]; 
				}
			}
			
			return result;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 293, 1000, 395, 678, 94 }, new int[] { 94, 777, 104, 1000, 1, 12 })));
		System.out.println(Arrays.toString(solution(new int[] { 110, 66, 439, 785, 1 }, new int[] { 377, 823, 119, 43 })));
	}
}
