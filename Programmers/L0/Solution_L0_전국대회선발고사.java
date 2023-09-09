import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_L0_전국대회선발고사 {
	public static int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        
        for(int i=0;i<rank.length;i++) {
        	if(attendance[i]) {
        		list.add(new int[] { i, rank[i] });
        	}
        }
        
        Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[1] > t2[1]) return 1;
				return -1;
			}
		});
        
        int result = 0;
        for(int i=0;i<3;i++) {
        	if(i == 0) {
        		result += 10000 * list.get(i)[0];
        	}else if(i == 1) {
        		result += 100 * list.get(i)[0];
        	}else {
        		result += list.get(i)[0];
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 7, 2, 5, 4, 6, 1 }, new boolean[] { false, true, true, true, true, false, false }));
		System.out.println(solution(new int[] { 1, 2, 3 }, new boolean[] { true, true, true }));
		System.out.println(solution(new int[] { 6, 1, 5, 2, 3, 4 }, new boolean[] { true, false, true, false, false, true }));
	}
}
