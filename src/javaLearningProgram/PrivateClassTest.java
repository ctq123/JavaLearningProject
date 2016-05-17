package javaLearningProgram;

public class PrivateClassTest {
	
//	private static int count = 1;
//	
//	public void setCount(int num){
//		if(num > 0){
//			count = num;
//		}
//	}
//	
//	public int getCount(){
//		return count;
//	}
	
	public static int count = 1;
	
	public static PrivateClassTest getInstance(){
		if(count > 0){
			count--;
			return new PrivateClassTest();
		}
		return null;
	}
	
	private PrivateClassTest(){
		System.out.println("调用PrivateClassTest构造器");
	}

}
