package ip;
import java.util.Arrays;

import java.util.Scanner;

public class Java { 
	
   
	public static void main(String[] args) {
		
	String[] text = "cat dog me".split(" ");
 Arrays.sort(text);
	String maxWord = null, word = null ;
	int maxCount = 0, count = 1;
	for (String s : text )	{
		if (s.equals(word)) {
		        count++;
		    } else {
		        if (count > maxCount) {
		            maxCount = count;
		            maxWord = word;
		        }
		        word = s;
		        count = 1;
		       
	   }
		
	  }
	 if (maxCount==count){
		maxWord = maxWord +" "+"&"+" " + word;
	 }
	  
	else { 
		if (!maxWord.equals(word) ) {
	}
	 
	
	else {
		 
			maxWord = word;
		maxCount = count;
	}
}
	if (maxCount == 1) {
		System.out.println("нет повтор€ющихс€ слов");
	}
	else {
		System.out.println( "используетс€ "+ " " + maxCount+" " +"раз");
		System.out.println("самое попул€рное слово"+" "+ maxWord);
	}
	
	}
}

