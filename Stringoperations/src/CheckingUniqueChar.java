
public class CheckingUniqueChar {

	public static void main(String[] args) {
		String s = "amrit";
		boolean flag = false;
		for(int i = 0; i<s.length(); i++) {
			for(int j = i + 1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) flag = true;
				
			}
			
		}
		if(flag==true) System.out.println("The given string doesnot contain unique characters");
		else System.out.println("The given string contains unique characters");

	}

}
