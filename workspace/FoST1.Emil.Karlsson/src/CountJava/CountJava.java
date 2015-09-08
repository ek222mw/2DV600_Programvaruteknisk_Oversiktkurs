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
		File dir =  new File("C:/Users/Emil/Desktop/dir");
		File[] files = dir.listFiles();
		int lines = 0;
		Map<String, Integer> res = new HashMap<String, Integer>();

		for(File f : files)
		{
			if(f.isFile())
			{
				try {
					Scanner filescan = new Scanner(new FileReader(f));
					lines = 0;
					while(filescan.nextLine() != null)
					{
						
						lines++;
					}
					
					
				} catch (NoSuchElementException e) {
					
					res.put(f.getName()+", Lines " , lines);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(res);

	}
}
