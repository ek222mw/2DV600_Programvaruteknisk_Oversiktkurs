package Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		
		//HashWordSet test
		HashWordSet hws = new HashWordSet();
		hws.add(new Word("hej"));
		System.out.println(hws.size());
		System.out.println(hws.contains(new Word("hej")));
		Iterator it = hws.iterator();
		while(it.hasNext())
		{
			System.out.println("Value: "+it.next());
		}
		
		
		//TreeWordSet test
		TreeWordSet tws = new TreeWordSet();
		//tws.add(new Word("hej"));
		//tws.add(new Word("hejsan"));
		File file = new File("C:\\Users\\Emil\\Desktop\\word.txt");
		try {
			Scanner filescan = new Scanner(file);
			while (filescan.hasNext()){
				Word next = new Word(filescan.next().toLowerCase());
				tws.add(next);
			}
		
		System.out.println("Size: "+tws.size());
		//System.out.println("Contains: "+tws.contains(new Word("hej")));
		Iterator ittree = tws.iterator();
		while(ittree.hasNext())
		{
			System.out.println(ittree.next());
		}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Value"+tws.)
	}

}
