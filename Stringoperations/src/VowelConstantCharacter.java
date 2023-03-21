

// Program to find out number of vowels, consonants and special characters in given string.
public class VowelConstantCharacter {

	public static void main(String[] args) {
		
		String str = "My name is some@nine!";
		
		int vowels = 0, consonants = 0,specialChar = 0;
		String s = str.replaceAll(" ", "");
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A'&& c<='Z' || c>='a' && c<='z') {
				
				c = Character.toLowerCase(c);
				if(c =='a' || c== 'e' || c== 'i' || c == 'o' || c== 'u') vowels++;
				else consonants++;	
				
			}
			else if(c>=0 && c<=9) continue;
			else specialChar++;
		}
		System.out.println(" Number of vowels in given string is: "+vowels);
		System.out.println(" Number of consonants in given string is: "+consonants);
		System.out.println(" Number of specialchar in given string is: "+specialChar);
	}

}
