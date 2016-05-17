package javaLearningProgram;

import java.io.Serializable;

public class SingleClassTest implements Serializable{
	
	private static SingleClassTest instance;
	private String name;
	
	private SingleClassTest(){
		System.out.println("调用SingleClassTeste无参构造器");
	}
	
	private SingleClassTest(String name){
		this.name = name;
		System.out.println("调用SingleClassTest有参构造器");
	}
	
	public static SingleClassTest getInstance(String name){
		if(instance == null){
			instance = new SingleClassTest(name);
		}
		return instance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	//保证反序列化得到已有的java实例
	private Object readResolve(){
		return instance;
	}

}
