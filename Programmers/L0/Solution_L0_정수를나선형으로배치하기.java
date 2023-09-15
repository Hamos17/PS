
public class Solution_L0_정수를나선형으로배치하기 {
	public static int[][] solution(int n) {
		int[][] result = new int[n][n];
		
		int i = 0, j = -1, val = 1;
		while(true) {
			if(val > n * n) {
				break;
			}
			
			while(j + 1 < n && result[i][j + 1] == 0) {
				result[i][++j] = val++;
			}
			
			while(i + 1 < n && result[i + 1][j] == 0) {
				result[++i][j] = val++;
			}
			
			while(j - 1 >= 0 && result[i][j - 1] == 0) {
				result[i][--j] = val++;
			}
			
			while(i - 1 >= 0 && result[i - 1][j] == 0) {
				result[--i][j] = val++;
			}
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(4));
		System.out.println(solution(5));
	}
}
