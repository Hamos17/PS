
public class Solution_L0_안전지대 {
	private static int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 };
	private static int[] dy = { 0, 0, -1, 1, -1, 1, 1, -1 };

	public static int solution(int[][] board) {
		int row = board.length;
		int col = board[0].length;

		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(board[i][j] == 1) {
					for(int d=0;d<8;d++) {
						int nx = i + dx[d];
						int ny = j + dy[d];

						if(0 <= nx && nx < row && 0 <= ny && ny < col && board[nx][ny] == 0) {
							board[nx][ny] = 2;
						}
					}
				}
			}
		}

		int count = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(board[i][j] == 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0 },
			{ 0, 0, 0, 0, 0 }
		}));
		System.out.println(solution(new int[][] { { 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 0 },
			{ 0, 0, 0, 0, 0 }
		}));
		System.out.println(solution(new int[][] { { 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1 }
		}));
	} 
}
