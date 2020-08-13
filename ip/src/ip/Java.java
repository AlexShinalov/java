package ip;
import java.util.Arrays;

import java.util.Scanner;

public class Java { 
	
   
	public static void main(String[] args) {
		
	String[] text = " dog cat dog dog cat me if i me cat dog dog for".split(" ");
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
		if (count > maxCount ) {
			 maxCount = count;
	            maxWord = word;
	}
     }
	if (maxCount == 1) {
		System.out.println("нет повтор€ющихс€ слов");
	}
	else {
		if (maxCount==2 || maxCount==3 || maxCount ==4 ) {
		System.out.println( "используетс€ "+ " " + maxCount+" " +"разa");
		System.out.println("самое попул€рное слово"+" "+ maxWord);
		} else {
			System.out.println( "используетс€ "+ " " + maxCount+" " +"раз");
		System.out.println("самое попул€рное слово"+" "+ maxWord);
			
		}
	   }
	
 }
}

