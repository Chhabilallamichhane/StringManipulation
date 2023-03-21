
public class PrintDuplicateChar {

	public static void main(String[] args) {
		String s = "avocado";
		StringBuilder str = new StringBuilder(s);
		System.out.println("Duplicates Character in the string are as follows:");
		for(int i = 0; i< str.length(); i++) {
			for(int j = i + 1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {

					System.out.println(str.charAt(i));
					
				}
			}
		}
		

	}

}
