import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_그림확대 {
	public static String[] solution(String[] picture, int k) {
		int len = picture.length;
		String[] width = new String[len];
		
		for(int i=0;i<width.length;i++) {
			String data = picture[i];
			String str = "";
			
			// 가로
			for(Character ch : data.toCharArray()) {
				for(int j=0;j<k;j++) {
					str += ch;
				}
			}
			
			width[i] = str;
		}
		
		List<String> list = new ArrayList<>();
		for(int i=0;i<len;i++) {
			for(int j=0;j<k;j++) {
				list.add(width[i]);
			}
		}

		String[] result = new String[list.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = list.get(i);
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...." }, 2)));
		System.out.println(Arrays.toString(solution(new String[] { "x.x", ".x.", "x.x" }, 3)));
	}
}
