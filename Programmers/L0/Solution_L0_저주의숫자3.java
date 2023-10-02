import java.util.ArrayList;
import java.util.List;

public class Solution_L0_저주의숫자3 {
	public static int solution(int n) {
		List<Integer> list = new ArrayList<>();

		int num = 1;
		while(list.size() != 100) {
			String str = String.valueOf(num);
			int idx = str.indexOf("3");

			if(num % 3 == 0 || idx != -1) {
				num++;
				continue;
			}

			list.add(num);

			num++;
		}

		list.add(0, 0);

		return list.get(n);
	}

	public static void main(String[] args) {
		System.out.println(solution(15));
		System.out.println(solution(40));
	}
}
