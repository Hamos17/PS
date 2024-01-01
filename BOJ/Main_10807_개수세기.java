import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_10807_개수세기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());

			if(!hashMap.containsKey(key)) {
				hashMap.put(key, 1);
			}else {
				hashMap.put(key, hashMap.get(key) + 1);
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int v = Integer.parseInt(st.nextToken());
		
		System.out.println(hashMap.containsKey(v) ? hashMap.get(v) : "0");
	}
}
