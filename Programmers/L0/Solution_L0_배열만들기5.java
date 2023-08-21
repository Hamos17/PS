import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_배열만들기5 {
	public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
		for(String str : intStrs) {
			String subStr = str.substring(s, s + l);
			if(Integer.parseInt(subStr) > k) {
				list.add(Integer.parseInt(subStr));
			}
		}

		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "0123456789", "9876543210", "9999999999999" }, 50000, 5, 5)));
	}
}
