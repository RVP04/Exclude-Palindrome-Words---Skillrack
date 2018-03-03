import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputWords = input.split(" ");
		
		for(String word : inputWords)
		{
		    String reverseWord = new StringBuilder(word).reverse().toString();
		    if(!(word.equalsIgnoreCase(reverseWord)))
		    {
		        System.out.print(word+" ");
		    }
		}
	}
}
