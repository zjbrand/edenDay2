package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReadFile {

	public static void main(String[] args) {
		//String folder="C:\\work\\file\\aaa\\2.txt";
		String folder="C:"+File.separator+"work"+
				File.separator+"file"+File.separator+"aaa"+File.separator+"2.txt";
		File f=new File(folder);
		
		//文件输入流
		FileInputStream fis=null;
		
		//读输入流
		InputStreamReader isr=null;
		
		//缓冲区输入流
		BufferedReader br=null;
		
		try {
			fis=new FileInputStream(f);
			isr=new InputStreamReader(fis);
			br=new BufferedReader(isr);
			
				while(br.ready()) {
					System.out.println(br.readLine());
				}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			
		}
		

	}

}
