package Mxm.Demo;

import java.io.File;

public class TestGetPath {
	public static void Test() {
		System.out.println(System.getProperty("user.dir"));// user.dir指定了当前的路径
	
		File directory = new File("");//设定为当前文件夹
		try{
		    System.out.println(directory.getCanonicalPath());	//获取标准的路径
		    System.out.println(directory.getAbsolutePath());	//获取绝对路径
				
		    directory = new File("abc");
		    System.out.println(directory.getCanonicalPath()); 	//得到的是C:\test\abc
		    System.out.println(directory.getAbsolutePath());    //得到的是C:\test\abc
		    System.out.println(directory.getPath());            //得到的是abc

			directory = new File(".");
			System.out.println(directory.getCanonicalPath()); 	//得到的是C:\test
			System.out.println(directory.getAbsolutePath());    //得到的是C:\test\.
			System.out.println(directory.getPath());            //得到的是.

			directory = new File("..");
			System.out.println(directory.getCanonicalPath()); 	//得到的是C:\
			System.out.println(directory.getAbsolutePath());    //得到的是C:\test\..
			System.out.println(directory.getPath());         	//得到的是..
		
			System.out.println(new File("abc.txt").getAbsolutePath()); 
		}
		catch(Exception e)
		{}
	}
}
