package javaLearningProgram;

import java.net.InetAddress;

public class ThreadTest extends Thread{
	
	public synchronized void run(){
		String currentServerIP = getCurrentServerIP();
		if(currentServerIP == null){
			System.out.println("getCurrentServerIP() made error!");
			return;
		}
		
		System.out.print("currentServerIP="+currentServerIP);
		printMsg();
		
//		for(int i=0;i<10;i++){
//			System.out.print(i+": currentServerIP="+currentServerIP);
//			printMsg();
//		}
	}
	
	public void printMsg(){
		Thread t = Thread.currentThread();
		long threadId = t.getId();
		String threadName = t.getName();
		System.out.println(" threadId="+threadId+" threadName="+threadName);
	}
	
	public String getCurrentServerIP(){
		try{
			InetAddress addr = InetAddress.getLocalHost();
			return addr.getHostAddress();
		}catch(Exception e){
			e.getStackTrace();
		}
		return null;
	}
	
	public static void main(String args[]){
//		ThreadTest tt = new ThreadTest();
//		tt.start();
		
		for(int i=0;i<10;i++){
			System.out.print(i+":");
			new ThreadTest().start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
