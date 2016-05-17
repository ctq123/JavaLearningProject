package javaLearningProgram;

public class StringTest {
	
	private static void tryCatchTest(){
		try{
			String msg = null;
			try{
				if(msg.equals("")){//bug
					
				}
			}catch(Exception e){
				System.out.println("这是内层try"+e.getMessage());
//				throw e;//传给外层
			}
		}catch(Exception e){
			System.out.println("这是外层try"+e.getMessage());
		}
	}
	
	private static void forTest(){
		
       //error:java语言规定：for，while或do循环中的重复执行语句不能是一条单独局部变量定义语句（除非使用花括号）		
//		for(int i=0;i<10;i++)
//			boolean flag=false;
		
		//correct
		for(int i=0;i<10;i++){
			boolean flag = false;
		}
		
	}

	public static void main(String[] args){
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
//		String t = s.concat("abc");
		char c = 'a';
		System.out.println(s);
		
		
		String callNumber = "13794131466";
		String callNumberStr;
		if(callNumber.length() == 11){
			callNumberStr = callNumber.substring(0, 3) + "****"+ callNumber.substring(7,11);
		}else{
			callNumberStr = "******";
		}
		
		System.out.println("callNumber:"+callNumber);
		System.out.println("callNumberStr:"+callNumberStr);
		
		
		String caller = "li先生";
		String callerStr;
		if(caller.length() != 3){
			callerStr = caller.substring(0,1);
			int len = caller.length();
			for(int i=1;i<len-2;i++){
				callerStr += "*";
			}
			callerStr += caller.substring(len-2,len);
		}else{
			callerStr = caller;
		}
		
		System.out.println("caller:"+caller);
		System.out.println("callerStr:"+callerStr);
		
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
//		tryCatchTest();

	}
}
