package �ļ�;

import java.io.File;
import java.io.IOException;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String c=System.getProperty("file.separator");
		String s="src"+c+"�ļ�"+c+"TestDemo.java";
		File f1=new File(s);
		System.out.println("����·����"+f1.getAbsolutePath());
		System.out.println("�ļ���С��"+f1.length()+"�ֽ�");
		System.out.println("���·����"+f1.getPath());
		
		File f2=new File("test.txt");
		
		if(!f2.isDirectory()&&!f2.exists()) {
			System.out.println("��text.txt�����ڣ�����"+f2.createNewFile());
		}
		else {
			System.out.println("��text.txt���ڣ�ɾ��"+f2.delete());
		}
		
	}

}
