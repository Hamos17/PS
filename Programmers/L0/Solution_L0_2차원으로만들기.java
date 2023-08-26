
public class Solution_L0_2차원으로만들기 {
	public static int[][] solution(int[] num_list, int n) {
        int[][] arr = new int[num_list.length/n][n];
 
        int idx = 0;
        for(int i=0;i<num_list.length/n;i++) {
        	for(int j=0;j<n;j++) {
        		arr[i][j] = num_list[idx++];
        	}
        }

        return arr;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 2));
		System.out.println(solution(new int[] { 100, 95, 2, 4, 5, 6, 18, 33, 948 }, 3));
	}
}
