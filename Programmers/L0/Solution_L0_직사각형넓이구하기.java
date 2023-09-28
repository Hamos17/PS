
public class Solution_L0_직사각형넓이구하기 {
	public static int solution(int[][] dots) {
		int w = 0;
		for(int i=0;i<dots.length;i++) {
			int x1 = dots[i][0];
			for(int j=i+1;j<dots.length;j++) {
				int x2 = dots[j][0]; 

				if(x1 == x2) {
					continue;
				}else {
					w = Math.abs(x1 - x2);
				}
			}
		}

		int h = 0;
		for(int i=0;i<dots.length;i++) {
			int y1 = dots[i][1];
			for(int j=i+1;j<dots.length;j++) {
				int y2 = dots[j][1]; 

				if(y1 == y2) {
					continue;
				}else {
					h = Math.abs(y1 - y2);
				}
			}
		}

		return w * h;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } }));
		System.out.println(solution(new int[][] { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } }));
	}
}
