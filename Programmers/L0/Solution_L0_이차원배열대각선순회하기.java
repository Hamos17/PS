
public class Solution_L0_이차원배열대각선순회하기 {
	public static int solution(int[][] board, int k) {
		int result = 0;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(i + j <= k) {
					result += board[i][j];
				}
			}
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } }, 2));
	}
}
