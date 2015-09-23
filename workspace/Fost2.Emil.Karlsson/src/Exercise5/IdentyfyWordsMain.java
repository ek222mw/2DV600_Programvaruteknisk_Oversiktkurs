package Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentyfyWordsMain {
	
	public static void main(String[] args)
	{
		
		File file = new File("C:\\Users\\Emil\\Desktop\\HistoryOfProgramming.txt");
		
		try {
			Scanner filescan = new Scanner(file);
			ArrayList<String> list = new ArrayList<String>();
			while(filescan.hasNext())
			{
				String scan = filescan.next().replaceAll("[^a-zA-Z\n]","");
				list.add(scan);
			}
			filescan.close();
			try {
				FileWriter filewriter = new FileWriter("C:\\Users\\Emil\\Desktop\\words.txt");
					
			    filewriter.write(list.toString().replace(",","").replace("[", "").replace("]", "").replace("  ", " ").trim());
				filewriter.close();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
