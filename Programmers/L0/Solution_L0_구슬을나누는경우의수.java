
public class Solution_L0_구슬을나누는경우의수 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static int count;
	
	public static void combination(int N, int R, int depth, int start) {
		if(depth == R) {
			count++;
			return;
		}
		
		for(int i=start;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				combination(N, R, depth + 1, i);

				visit[i] = false;
			}
		}
	}
	
	public static int solution(int balls, int share) {
		data = new int[balls];
		for(int i=0;i<balls;i++) {
			data[i] = (i + 1);
		}
		
		res = new int[share];
		visit = new boolean[balls];
		
		count = 0;
		combination(balls, share, 0, 0);
	
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(5, 3));
	}
}
