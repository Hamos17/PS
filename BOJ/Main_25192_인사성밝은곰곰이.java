import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_25192_인사성밝은곰곰이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());

		HashSet<String> hashSet = new HashSet<>();
		int count = 0;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String input = st.nextToken();

			if("ENTER".equals(input)) {
				count += hashSet.size();
				hashSet.clear();
				
				continue;
			}
			
			hashSet.add(input);
		}
		
		count += hashSet.size();
		System.out.println(count);
	}
}
