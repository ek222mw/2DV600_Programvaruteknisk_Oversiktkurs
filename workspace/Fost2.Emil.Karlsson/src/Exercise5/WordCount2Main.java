package Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordCount2Main {

	public static void main(String[] args)
	{
		
		try {
			//file path
			File file = new File("C:\\Users\\Emil\\Desktop\\words.txt");
			Scanner filescan = new Scanner(file);
			//new instances
			HashWordSet hws = new HashWordSet();
			TreeWordSet tws = new TreeWordSet();
			
			while (filescan.hasNext()){
				Word next = new Word(filescan.next().toLowerCase());
				//adds words.
				tws.add(next);
				hws.add(next);
			}
			filescan.close();
			//hash title
		    System.out.println("*Hash iterator* \n");
		    //hash iterator
		    Iterator ithash = hws.iterator();
		    while(ithash.hasNext()){
		    	
		    	System.out.println(ithash.next());
		    }
		    System.out.println("\n");
		    //tree title
		    System.out.println("*Tree iterator* \n");
		    Iterator ittree =tws.iterator();
		    //tree iterator
		    while(ittree.hasNext()){
		    	
		    	System.out.println(ittree.next());
		    }
		    //prints tree size
		    System.out.println("Tree size: "+tws.size());
		    
		    //prints hash size
		    System.out.println("Hash size: "+hws.size());
		    //prints, see if tree contains if does returns true else false;
		    System.out.println("Tree contains: "+tws.contains(new Word("x")));
		    //prints, see if hash contains if does returns true else false;
		    System.out.println("Hash contains: "+hws.contains(new Word("x")));
		  //prints tree toString.
		    System.out.println("hash toString: "+hws.toString());
		    //prints hash toString
		    
		    System.out.println("tree toString: "+tws.toString());
		    //catches exception if file not found.
		}catch (FileNotFoundException e) {
				
				e.printStackTrace();
		}
	
	
	}
}
