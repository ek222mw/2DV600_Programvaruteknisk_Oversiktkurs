package CountChars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountChars {
	
	
	public static void main(String[] args){
		
		//init searchpath for file
		File file = new File("C:\\Users\\Emil\\Desktop\\chars.txt");
		int Upper = 0, Lower = 0, Number = 0, Other = 0, whitespace = 0;
		
		
		//try block that sends exceptions to the catch for handling.
		try {
			//init scanner with file path
			Scanner filescan = new Scanner(file);
			
			//while scanner has next line return true else false.
			while(filescan.hasNextLine())
			{
				//read nextline in file.
				String scan = filescan.nextLine();
				//scans whole file.
				for(int i = 0; i<scan.length(); i++)
				{	//if char is uppercase count it.
					if(Character.isUpperCase(scan.charAt(i)))
					{
						Upper++;
					}//if chars is lowercase count it.
					else if(Character.isLowerCase(scan.charAt(i)))
					{
						Lower++;
					}//if char is whitespace count it
					else if(Character.isWhitespace(scan.charAt(i)))
					{
						whitespace++;
					}//if char is digit count it
					else if(Character.isDigit(scan.charAt(i)))
					{
						Number++;
					}//if char it other count it.
					else{
						Other ++;
					}
				}
			}
			//print out all counts and then close scanner.
			System.out.println("Uppercase: "+Upper+ " Lowercase: "+ Lower + " Whitespace: "+ whitespace+ " Digits: "+ Number+ " Other: "+Other);
			filescan.close();
			
			//if file not found throw exception and catch it here and print it.
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
