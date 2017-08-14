package Mxm.Demo;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PicDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://baba7901.lofter.com/post/1f01f98f_10d5f6fb";

		try {// get url
				// StringReader sr = new StringReader("d:/testJJ.txt");
				// char[] ch = new char[1024];
				// int len = sr.read(ch);
				// url = new String(ch, 0, len);
			System.out.println("download url: " + url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String html = getWebCon(url);
		System.out.println(html);
		
		GetImgUrls(html);
	}

	// public static void Demo() {
	// String url = "http://baba7901.lofter.com/post/1f01f98f_10d5f6fb";
	// String html = getWebCon(url);
	// System.out.print(html);
	// }

	public static String getWebCon(String domain) {
		// System.out.println("开始读取内容...("+domain+")");
		StringBuffer sb = new StringBuffer();
		try {
			java.net.URL url = new java.net.URL(domain);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				sb.append(line);
			}
			in.close();
		} catch (Exception e) { // Report any errors that arise
			sb.append(e.toString());
			System.err.println(e);
			System.err.println("Usage:   java   HttpClient   <URL>   [<filename>]");
		}
		return sb.toString();
	}

	public static void GetImgUrls(String html) {
		String regEx = "^http://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
		Pattern p = Pattern.compile(regEx);
		Matcher mat = p.matcher(html);
		
		System.out.println(mat.matches()); 
//		while (p.matcher(html).find()) {
//
//		}

	}

}
