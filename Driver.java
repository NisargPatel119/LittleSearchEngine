package lse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		LittleSearchEngine engine= new LittleSearchEngine();
	     ArrayList<Occurrence>occs = new ArrayList<Occurrence>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter document file name => ");//docs.txt
		String docsFile=br.readLine();
		System.out.print("Enter noise words file name => ");//noisewords.txt
		String noiseWordsFile=br.readLine();
		engine.makeIndex(docsFile, noiseWordsFile);
		System.out.println(engine.top5search("orange", "weird"));
		System.out.println(engine.getKeyWord("sWord"));
	}
	}