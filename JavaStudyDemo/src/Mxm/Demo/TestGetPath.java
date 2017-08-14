package Mxm.Demo;

import java.io.File;

public class TestGetPath {
	public static void Test() {
		System.out.println(System.getProperty("user.dir"));// user.dirָ���˵�ǰ��·��
	
		File directory = new File("");//�趨Ϊ��ǰ�ļ���
		try{
		    System.out.println(directory.getCanonicalPath());	//��ȡ��׼��·��
		    System.out.println(directory.getAbsolutePath());	//��ȡ����·��
				
		    directory = new File("abc");
		    System.out.println(directory.getCanonicalPath()); 	//�õ�����C:\test\abc
		    System.out.println(directory.getAbsolutePath());    //�õ�����C:\test\abc
		    System.out.println(directory.getPath());            //�õ�����abc

			directory = new File(".");
			System.out.println(directory.getCanonicalPath()); 	//�õ�����C:\test
			System.out.println(directory.getAbsolutePath());    //�õ�����C:\test\.
			System.out.println(directory.getPath());            //�õ�����.

			directory = new File("..");
			System.out.println(directory.getCanonicalPath()); 	//�õ�����C:\
			System.out.println(directory.getAbsolutePath());    //�õ�����C:\test\..
			System.out.println(directory.getPath());         	//�õ�����..
		
			System.out.println(new File("abc.txt").getAbsolutePath()); 
		}
		catch(Exception e)
		{}
	}
}
