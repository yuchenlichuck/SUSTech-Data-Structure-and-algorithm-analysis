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

public class TestStaticImport {
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
