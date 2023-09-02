
public class Solution_L1_소수만들기 {
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int solution(int[] nums) {
		int count = 0;
		for(int i=0;i<nums.length;i++) {
        	int num1 = nums[i];
        	for(int j=i+1;j<nums.length;j++) {
        		int num2 = nums[j];
        		for(int k=j+1;k<nums.length;k++) {
        			int num3 = nums[k];
        			
        			int sum = num1 + num2 + num3;
        			
        			if(isPrime(sum)) {
        				count++;
        			}
        		}
        	}
        }
		
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(solution(new int[] { 1, 2, 7, 6, 4 }));
	}
}
