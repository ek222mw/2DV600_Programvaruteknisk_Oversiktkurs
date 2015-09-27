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
		//creates arraylist.
		ArrayList<String> Alist = new ArrayList<String>();
		try {
			//creates new file with path to textfile.
			File file = new File("C:\\Users\\Emil\\Desktop\\HistoryOfProgramming.txt");
			//new scanner with filepath.
			Scanner	filescan = new Scanner(file);
			//scans nextline.
			while (filescan.hasNextLine()){
				//scans next line.
				String t = filescan.nextLine();
				//replaces - with whitespace.
				String t2 = t.replaceAll("\\-", " ");
				//replaces all a-zA-Z\n with nothing.
				String rep = t2.replaceAll("[^a-zA-Z\n ]", "");
				//replaces all one or many whitespaces with whitespace.
				rep = rep.replaceAll("\\s+", " ");
				//if not empty and toString then rep to arraylist.
				if(!rep.toString().isEmpty()){
					Alist.add(rep+"\n");
				}
			}
			//close scanner.
			filescan.close();
		
		try {
			//creates filewriter and path to write to.
			FileWriter	fwriter = new FileWriter("C:\\Users\\Emil\\Desktop\\words.txt");
			//for all objects in list write object.
			for(String item: Alist) {
			  fwriter.write(item);
			}
			//close writer.
			fwriter.close();
		}
		//catches IOExceptions.
		catch (IOException e) {
				
				e.printStackTrace();
		}
		}
		//catches file not found exception.
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
		
		
		
	}

}
