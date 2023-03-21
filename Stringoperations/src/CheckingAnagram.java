import java.util.Arrays;
public class CheckingAnagram {

	public static void main(String[] args) {
		String s1 = "shore";
		String s2 ="horse";
		int count = 0;
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
	  if(c1.length == c2.length) {
		  for(int i = 0; i< c1.length; i++) {
			  if(c1[i] == c2[i]) {
				  count++;
			  }
		  }
		  if(count == c1.length && count == c2.length) System.out.println("Given two strings are  anagram");
		  else System.out.println("Given two strings are not anagram");
	  }
	  else System.out.println("Given two strings are not anagram");
	}

}
