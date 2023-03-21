import java.util.Arrays;

class Duplicate{
	static StringBuilder removeDuplicates(StringBuilder s) {
		
		for(int i = 0; i< s.length(); i++) {
			for(int j = i + 1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {

					s.deleteCharAt(j);
					j--;
				}
			}
		}
		return s;
	}

}
class Penagram{
	
    static void chekPenagram(StringBuilder s) {
    	
    	s = Duplicate.removeDuplicates(s);
	    char [] c = s.toString().toCharArray();
		
		Arrays.sort(c);
		int count = 0;
		for(int i = 0;i <c.length; i++) {
			char ch = c[i];
			check: if(ch>='a' && ch<='z') {
				
				for(int j = 97 + i; j <= 122; j++) {
					if(ch == j) {
						++count;
						break check;
					}
				}
			}
	   
	
		
		

	}
		  if(count == 26) System.out.println("The given string is penagram");
			else  System.out.println("The given string is not penagram");
	}
}



public class ChekingPenagram {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		String s = str.replaceAll(" ", "").toLowerCase();
		StringBuilder str1 = new StringBuilder(s);
		
	    Penagram.chekPenagram(str1);

}
}
