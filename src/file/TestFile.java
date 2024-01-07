package file;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		
		File file1=new File("C:\\work\\file\\aa");
		file1.mkdir();
		
		File file2=new File("C:\\work\\file\\aa\\"+"1.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
