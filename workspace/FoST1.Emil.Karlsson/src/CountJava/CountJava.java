package CountJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CountJava {
	
	public static void main(String[] args)
	{
		//enter path for directory.
		File dir =  new File("C:/Users/Emil/Desktop/dir");
		//put in files into file array.
		File[] files = dir.listFiles();
		int lines = 0;
		Map<String, Integer> res = new HashMap<String, Integer>();
		//foreach file in file array
		for(File f : files)
		{	//if file is file then true.
			if(f.isFile())
			{
				try {
					//init scanner with filereader argument file.
					Scanner filescan = new Scanner(new FileReader(f));
					lines = 0;
					//while scanner has next line count it.
					while(filescan.nextLine() != null)
					{
						
						lines++;
					}
					
					//if nosuchelementexception occurs then put filenames and lines.
				} catch (NoSuchElementException e) {
					
					res.put(f.getName()+", Lines " , lines);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//prints filenames with line count.
		System.out.println(res);

	}
}
