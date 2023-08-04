import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_13223_소금폭탄 {
	public static String calcTimes(int time) {
		int h = (time / 3600);
		time -= (h * 3600);
		
		int m = (time / 60);
		time -= (m * 60);
		
		int s = time;
		
		String hh = String.valueOf(h);
		hh = hh.length() == 1 ? "0" + hh : hh;
		
		String mm = String.valueOf(m);
		mm = mm.length() == 1 ? "0" + mm : mm;
		
		String ss = String.valueOf(s);
		ss = ss.length() == 1 ? "0" + ss : ss; 
		
		return hh + ":" + mm + ":" + ss;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] curTime = br.readLine().split(":");
		String[] throwTime = br.readLine().split(":");
		
		int curTimes = Integer.parseInt(curTime[0]) * 3600 + Integer.parseInt(curTime[1]) * 60 + Integer.parseInt(curTime[2]);
		int throwTimes = Integer.parseInt(throwTime[0]) * 3600 + Integer.parseInt(throwTime[1]) * 60 + Integer.parseInt(throwTime[2]);
	
		if(curTimes == throwTimes) {
			System.out.print("24:00:00");
			return;
		}
		
		String result = "";
		if(curTimes <= throwTimes) {
			result = calcTimes(throwTimes - curTimes);
		}else {
			int comp = (24 * 3600);

			comp -= curTimes;
			comp += throwTimes;

			result = calcTimes(comp);
		}

		System.out.print(result);
	}
}