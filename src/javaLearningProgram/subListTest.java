package javaLearningProgram;

import java.util.ArrayList;
import java.util.List;

public class subListTest {

	public static void main(String[] args){
		
		List<String> list = new ArrayList<String>();
		list.add("test");
		
		//ArrayList<String> subList = list.subList(0, 0);//get null
		List<String> subList = list.subList(0, 1);
		System.out.println("subList.size()="+subList.size());
		System.out.println("subList="+subList);
	}
	
	
}
