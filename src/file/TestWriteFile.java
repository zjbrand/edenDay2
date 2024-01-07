package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TestWriteFile {

	public static void main(String[] args) throws IOException {
		//创建要写入文件的List集合
		List<String> strList=new ArrayList<>();
		//List集合添加内容
		strList.add("你好");
		strList.add("Hello");
		strList.add("こんにちは");
		
		//定义目标文件夹
		String folder="C:\\work\\file\\aaa\\";
		
		//创建File对象
		File file1=new File(folder);
		
		//建立文件夹
		file1.mkdir();
		
		//创建文件对象
		File file2=new File(folder+"2.txt");
		
		//创建文件
		file2.createNewFile();
		
		//文件输出流
		FileOutputStream fos=new FileOutputStream(folder+"2.txt");
		
		//写输出流
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		
		//缓冲区输出流
		BufferedWriter bw=new BufferedWriter(osw);
		
		for(String str:strList) {
			bw.write(str);
			//bw.flush();
			bw.newLine();
			
		}
			
		bw.close();
		System.out.println("file closed");

	}

}
