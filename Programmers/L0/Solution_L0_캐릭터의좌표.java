import java.util.Arrays;

public class Solution_L0_캐릭터의좌표 {
	public static int[] solution(String[] keyinput, int[] board) {
		int y = 0, x = 0;
		for(String key : keyinput) {
			switch (key) {
			case "up":
				if(y + 1 <= board[1] / 2) {
					y++;
				}

				break;
			case "down":
				if(y - 1 >= (board[1] / 2) * -1) {
					y--;
				}

				break;
			case "left":
				if(x - 1 >= (board[0] / 2) * -1) {
					x--;
				}

				break;
			default: 
				if(x + 1 <= board[0] / 2) {
					x++;
				}

				break;
			}
		}

		return new int[] { x, y };
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "left", "right", "up", "right", "right" }, new int[] { 11, 11 })));
		System.out.println(Arrays.toString(solution(new String[] { "down", "down", "down", "down", "down" }, new int[] { 7, 9 })));
	}
}
