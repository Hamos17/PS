import java.util.Arrays;

public class Solution_L0_할일목록 {
	public static String[] solution(String[] todo_list, boolean[] finished) {
		int count = 0;
		for(boolean chk : finished) {
			if(!chk) {
				count++;
			}
		}
		
		String[] result = new String[count];
	
		int idx = 0;
		for(int i=0;i<finished.length;i++) {
			if(!finished[i]) {
				result[idx++] = todo_list[i];
			}
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "problemsolving", "practiceguitar", "swim", "studygraph" }, new boolean[] { true, false, true, false })));
	}
}
