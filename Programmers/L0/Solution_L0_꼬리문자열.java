
public class Solution_L0_꼬리문자열 {
	public static String solution(String[] str_list, String ex) {
		String result = "";
		for(int i=0;i<str_list.length;i++) {
			String str = str_list[i];
			
			if(!str.contains(ex)) {
				result += str;
			}
		}

		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new String[] { "abc", "def", "ghi" }, "ef"));
		System.out.println(solution(new String[] { "abc", "bbc", "cbc" }, "c"));
	}
}
