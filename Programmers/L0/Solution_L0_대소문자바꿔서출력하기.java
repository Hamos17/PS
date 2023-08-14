import java.util.Scanner;

public class Solution_L0_대소문자바꿔서출력하기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
    
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length();i++) {
        	char ch = a.charAt(i);
        	
        	if('A' <= ch && ch <= 'Z') {
        		sb.append((char)(ch + 32));
        	}else {
        		sb.append((char)(ch - 32));
        	}
        }
        
        System.out.println(sb.toString().trim());
        
        /*
         * a different approach
         */
        String result = "";
        for(Character c : a.toCharArray()) {
        	if(Character.isUpperCase(c)) {
        		result += Character.toLowerCase(c); 
        	}
        	
        	if(Character.isLowerCase(c)) {
        		result += Character.toUpperCase(c);
        	}
        }
        
        System.out.println(result);
	}
}