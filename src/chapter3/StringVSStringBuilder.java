package chapter3;

public class StringVSStringBuilder {

	public static void main(String[] args) {
		/*String alpha = "";
		for (char current = 'a'; current <= 'z'; current++)
			alpha += current;
			alpha = alpha + current;
		System.out.println(alpha);*/
		
       StringBuilder alpha = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++)
			alpha.append(current);
		System.out.println(alpha); 

	}

}
