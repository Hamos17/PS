import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_왼쪽오른쪽 {
	public static String[] solution(String[] str_list) {
		int flag = 0;
		for(String str : str_list) {
			if("l".equals(str)) {
				flag = 1;
				break;
			}else if("r".equals(str)){
				flag = 2;
				break;
			}
		}

		if(flag == 0) {
			return new String[] { };
		}

		List<String> list = new ArrayList<>();
		if(flag == 1) {
			for(String str : str_list) {
				if("l".equals(str)) {
					break;
				}else {
					list.add(str);
				}
			}
		}else if(flag == 2) {
			loop: for(int i=0;i<str_list.length;i++) {
				if("r".equals(str_list[i])) {
					for(int j=i+1;j<str_list.length;j++) {
						list.add(str_list[j]);
					}

					break loop;
				}
			}
		}

		String[] result = new String[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] =list.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "u", "u", "l", "r" })));
		System.out.println(Arrays.toString(solution(new String[] { "l" })));
	}
}
