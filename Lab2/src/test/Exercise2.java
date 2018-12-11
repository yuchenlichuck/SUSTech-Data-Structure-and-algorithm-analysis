package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Person{
	private String name;
	private int born;
	private String country;

	public Person(String name, int born, String country ) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		this.born = born;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}



public class Exercise2 {
public static void duqu(String path) {
	StringBuffer sb=new StringBuffer("");
	try{
		Reader reader =new InputStreamReader(new FileInputStream(path),"UTF-8");
				BufferedReader bufferedReader = new BufferedReader(reader);
				String string = null;
				while((string =bufferedReader.readLine())!=null){
					sb.append(string+"\n");
				}
	bufferedReader.close();
	reader.close();
	System.out.println("Finish Reading");

	}catch (FileNotFoundException e){
		e.printStackTrace();
	}	
	catch (IOException e){
		e.printStackTrace();
	}
	System.out.println(sb);
}


	public static void main(String[] args) throws IOException{
		String path=".";
		File f =new File(path);
		System.out.println("please enter the file name");
		System.out.println(f.getAbsolutePath());
		Scanner in = new Scanner(System.in);
		String path1 =in.next();
		path =path1;
		duqu(path);
		String path2 =in.next();
		if (path != path2) {
			path = path2;
			duqu(path);
		}
		else  {System.out.println("Finish Reading");
		}
		}

}
