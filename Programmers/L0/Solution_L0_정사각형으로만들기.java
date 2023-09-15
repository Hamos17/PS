
public class Solution_L0_정사각형으로만들기 {
	public static int[][] solution(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		if(row == col) {
			return arr;
		}
		
		if(row > col) {
			int[][] result = new int[row][row];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					result[i][j] = arr[i][j];
				}
			}
			
			return result;
		}else {
			int[][] result = new int[col][col];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					result[i][j] = arr[i][j];
				}
			}
			return result;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 572, 22, 37 }, { 287, 726, 384 }, { 85, 137, 292 }, { 487, 13, 876 } }));
		System.out.println(solution(new int[][] { { 57, 192, 534, 2 }, { 9, 345, 192, 999 } }));
		System.out.println(solution(new int[][] { { 1, 2 }, { 3, 4 } }));
	}
}
