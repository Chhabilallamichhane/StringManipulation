
public class DuplicateChar {

	public static void main(String[] args) {
		String s = "expppghvbhrxesssdshsss";
		StringBuilder str = new StringBuilder(s);
		
		for(int i = 0; i< str.length(); i++) {
			for(int j = i + 1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {

					str.deleteCharAt(j);
					j--;
				}
			}
		}
		System.out.println(str);

	}

}
