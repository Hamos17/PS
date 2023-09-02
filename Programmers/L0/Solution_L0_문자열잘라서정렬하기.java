import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_문자열잘라서정렬하기 {
	public static String[] solution(String myString) {
        String[] splits = myString.split("x");
        List<String> list = new ArrayList<>();
  
        for(String split : splits) {
        	if(!split.equals("")) {
        		list.add(split);
        	}
        }

        String[] result = new String[list.size()];
        for(int i=0;i<result.length;i++) {
        	result[i] = list.get(i);
        }
        
        Arrays.sort(result);

        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("axbxcxdx")));
		System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
		System.out.println(Arrays.toString(solution("axxxbxcxdx")));
	}
}
