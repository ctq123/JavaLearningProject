package javaLearningProgram;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MemcachedTest {

	public static void main(String args[]) throws Exception{
		
		Socket socket = new Socket("127.0.0.1",11211);
		OutputStream out = socket.getOutputStream();
		InputStream input = socket.getInputStream();
//		
//		byte[] setValue = "set username 0 0 7\nmyHappy\n".getBytes("utf-8");
//		out.write(setValue);
//		out.flush();
//		
//		byte[] len = new byte[1024];
//		int num = input.read(len);
//		System.out.println("返回的结果为:");
//		System.out.println(new String(len,0,num));
		
		byte[] getValue = "get username\n".getBytes("utf-8");
		out.write(getValue);
		out.flush();
		
		byte[] len2 = new byte[1024];
		int num2 = input.read(len2);
		System.out.println("返回的结果为:");
		System.out.println(new String(len2,0,num2));
	}
}
