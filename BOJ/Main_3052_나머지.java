import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_3052_나머지 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i=1;i<=10;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int num = Integer.parseInt(st.nextToken());
			int mod = num % 42;
			
			hashSet.add(mod);
		}
		
		System.out.println(hashSet.size());
	}
}
