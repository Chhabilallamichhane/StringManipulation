import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check for palindrom: ");
		String s = sc.next();
		String reverse = "";
		
		for(int j = s.length() -1; j>=0; j--) {
			reverse = reverse + s.charAt(j);
			
		}
		if(reverse.equalsIgnoreCase(s)) {
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("the given string is not palindrome");
		}
		System.out.println(s);
	}

}
