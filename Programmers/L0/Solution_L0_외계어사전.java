
public class Solution_L0_외계어사전 {
	public static int solution(String[] spell, String[] dic) {
		for(String word : dic) {
			boolean flag = false;
			for(int i=0;i<spell.length;i++) {
				if(!word.contains(spell[i])) {
					flag = false;
					break;
				}else {
					flag = true;
				}
			}

			if(flag) {
				return 1;
			}
		}

		return 2;
	}

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "p", "o", "s" }, new String[] { "sod", "eocd", "qixm", "adio", "soo" }));
		System.out.println(solution(new String[] { "z", "d", "x" }, new String[] { "def", "dww", "dzx", "loveaw" }));
		System.out.println(solution(new String[] { "s", "o", "m", "d" }, new String[] { "moos", "dzx", "smm", "sunmmo", "som" }));
	}
}
