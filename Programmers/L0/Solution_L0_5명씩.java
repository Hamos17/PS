import java.util.Arrays;

public class Solution_L0_5명씩 {
	public static String[] solution(String[] names) {
		int div = names.length / 5;
		int mod = names.length % 5 > 0 ? 1 : 0;
		
        String[] result = new String[mod + div];
 
        int idx = 0;
        for(int i=0;i<result.length;i++) {
        	result[i] = names[idx];
        	idx += 5;
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" })));
	}
}	
