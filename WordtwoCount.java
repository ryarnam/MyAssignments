package Assignments;

public class WordtwoCount {

	public static void main(String[] args) {
		String text= "Hello World";
		
		String[] words= text.split("//s+");
		String word = words[words.length-1];
		int wordCount = word.length();
		System.out.println(wordCount);
	}

}
