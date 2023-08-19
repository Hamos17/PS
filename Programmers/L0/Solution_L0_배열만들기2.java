import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L0_배열만들기2 {
	 public static int[] solution(int l, int r) {
		 List<Integer> list = new ArrayList<>();
		 for(int i=l;i<=r;i++) {
			 String num = String.valueOf(i);
			 
			 boolean flag = true;
			 for(Character ch : num.toCharArray()){
				 if(ch != '0' && ch != '5') {
					 flag = false;
					 break;
				 }
			 }
			 
			 if(flag) {
				 list.add(Integer.parseInt(num));
			 }
		 }
		 
		 if(list.isEmpty()) {
			 return new int[] { -1 };
		 }
		 
		 int[] result = new int[list.size()];
		 for(int i=0;i<result.length;i++) {
			 result[i] = list.get(i);
		 }
		 
		 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, 555)));
		System.out.println(Arrays.toString(solution(10, 20)));
	}
}
