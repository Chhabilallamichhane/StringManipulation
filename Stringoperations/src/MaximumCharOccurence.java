
public class MaximumCharOccurence {

	public static void main(String[] args) {
		String str = "Mark my wordsss".replaceAll(" ", "").toLowerCase();
		 
		char [] ch = str.toCharArray();
		
		int max_frequency = 1;
		char max_occurence = ' ';
		
		for(int i = 0; i<ch.length; i++) {
			
			int temp_frequency = 1;
			for(int j = i + 1; j<ch.length; j++) {
				
				if(ch[i] == ch[j]) temp_frequency++;
				
			}
			if(temp_frequency>max_frequency) {
				max_frequency = temp_frequency;
				max_occurence = ch[i];
			}
		}
		 System.out.println("Maximum occurence of character in the given string is: "+ max_occurence);

	}

}
