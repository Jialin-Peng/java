package 文件;

import java.io.File;
import java.io.IOException;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String c=System.getProperty("file.separator");
		String s="src"+c+"文件"+c+"TestDemo.java";
		File f1=new File(s);
		System.out.println("绝对路径："+f1.getAbsolutePath());
		System.out.println("文件大小："+f1.length()+"字节");
		System.out.println("相对路径："+f1.getPath());
		
		File f2=new File("test.txt");
		
		if(!f2.isDirectory()&&!f2.exists()) {
			System.out.println("若text.txt不存在，创建"+f2.createNewFile());
		}
		else {
			System.out.println("若text.txt存在，删除"+f2.delete());
		}
		
	}

}
