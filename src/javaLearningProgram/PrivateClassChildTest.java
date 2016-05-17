package javaLearningProgram;

import java.awt.List;
import java.util.ArrayList;

public class PrivateClassChildTest{//extends PrivateClassTest error
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args){
		System.out.println("test");
		PrivateClassTest.count = 1;
		PrivateClassTest p1 = PrivateClassTest.getInstance();
		
		if(p1 != null){
			System.out.println("p1 != null");
			System.out.println("p1.count="+p1.count);
//			p1.setCount(2);
		}else{
			System.out.println("p1 == null");
		}
		
		PrivateClassTest p2 = PrivateClassTest.getInstance();
		if(p2 != null){
			System.out.println("p2 != null");
			System.out.println("p2.count="+p2.count);
		}else{
			System.out.println("p2 == null");
		}
		
		
		ArrayList list = new ArrayList();
		list.add("ea");
		list.add("dasf");
		ArrayList<Integer> intList = list;
		for(int i=0;i<intList.size();i++){
//			Integer in = intList.get(i);//error, this equals-> Integer in = (Integer)intList.get(i);
//			System.out.println(in);//error
			System.out.println(intList.get(i));
		}
			
	}
	
}
