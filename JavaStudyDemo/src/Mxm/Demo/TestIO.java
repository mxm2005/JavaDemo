package Mxm.Demo;

import java.io.*;
import java.nio.ByteBuffer;

public class TestIO {

	public static void WriteToFile() {
		System.out.println("hello");
		try {
			FileWriter fs = new FileWriter("D:\\testJJ.txt");
			fs.write("hello,hello,美女，大美女");
			fs.flush();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void ReadFile() {
		try {
			FileReader fs = new FileReader("D:\\testJJ.txt");
			char[] ch = new char[1024];
			int len = fs.read(ch);
			System.out.println(new String(ch, 0, len));
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void replaceTxt() {
		String before = "美女";
		String after = "漂亮妞";
		FileReader reader = null;
		FileWriter writer = null;
		StringBuilder sb = new StringBuilder();
		int flag = 0;
		char[] temp = new char[1024];
		try {
			reader = new FileReader("D:\\testJJ.txt");
			while ((flag = reader.read(temp)) != -1) {
				sb.append(temp);
			}
			String content = sb.toString().replace(before, after);
			writer = new FileWriter("D:\\testJJ.txt");
			writer.write(content);
			writer.flush();
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			reader = null;
		}
	}
}
