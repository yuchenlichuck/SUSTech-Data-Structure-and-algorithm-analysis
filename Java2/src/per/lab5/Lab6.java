package per.lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.spi.CharsetProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab6 {
	public static String readFile(String path, String code) {
		File file = new File(path);
		FileInputStream is = null;
		StringBuilder stringBuilder = null;
		try {
			if (file.length() != 0) {
				is = new FileInputStream(file);
				InputStreamReader streamReader = new InputStreamReader(is, code);
				BufferedReader reader = new BufferedReader(streamReader);
				String line;
				stringBuilder = new StringBuilder();
				while ((line = reader.readLine()) != null) {
					stringBuilder.append(line);
				}

				reader.close();
				is.close();
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return String.valueOf(stringBuilder);
	}
	
	public static void main(String[]args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
		TreeMap<String, Integer> map=new TreeMap<String, Integer>();
	
	String sentence = readFile("King.txt", "UTF-8");
		Tokenizer in=new Tokenizer("King.txt");


while (true) {
	String string=in.nextToken();
	if (string==null)
		break;
		if(map.containsKey(string)) { 
			int q=map.get(string);
		map.put(string, q+1);
		}
	
		else {
			map.put(string, 1);
		}	
	}
	int i=0;
	TreeMap<Integer,String> map1=new TreeMap<>();
	for(Map.Entry<String, Integer> m:map.entrySet()){
		map1.put(m.getValue(), m.getKey());
	}
	int ss=map1.size();



	for(Map.Entry<Integer,String> m:map1.entrySet()){
		i++;
		int s=m.getKey();
		String e=m.getValue();
		if (i>ss-10)
		System.out.println(s+"=["+e+"]");
		
	}


	
	}
}