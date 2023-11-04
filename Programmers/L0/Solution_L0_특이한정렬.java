import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_L0_특이한정렬 {
	public static int[] solution(int[] numlist, int n) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer v1, Integer v2) {
				int abs1 = Math.abs(n - v1);
				int abs2 = Math.abs(n - v2);
				
				if(abs1 > abs2) {
					return 1;
				}else if(abs1 == abs2) {
					if(v1 < v2) {
						return 1;
					}
				}
				
				return -1;
			}
		});
		
		for(int num : numlist) {
			pq.offer(num);
		}
		
		int[] result = new int[numlist.length];
		
		int idx = 0;
		while(!pq.isEmpty()) {
			result[idx++] = pq.poll();
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5, 6 }, 4)));
		System.out.println(Arrays.toString(solution(new int[] { 10000, 20, 36, 47, 40, 6, 10, 7000 }, 30)));
	}
}
