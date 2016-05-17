package javaLearningProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloseResourceTest {
	public static void main(String[] args){
		SingleClassTest s1 = SingleClassTest.getInstance("Jack");
		System.out.println("SingleClassTest already crated");
		SingleClassTest s2 = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try{
			oos = new ObjectOutputStream(new FileOutputStream("s.bin"));
			//序列化输出java对象
			oos.writeObject(s1);
			oos.flush();
			
			ois = new ObjectInputStream(new FileInputStream("s.bin"));
			//反序列化恢复java对象
			s2 = (SingleClassTest)ois.readObject();
			
			if(s1==s2){
				System.out.println("s1==s2");
				System.out.println("s1.getName()="+s1.getName());
				System.out.println("s2.getName()="+s2.getName());
			}else{
				System.out.println("s1!=s2");
				System.out.println("s1.getName()="+s1.getName());
				System.out.println("s2.getName()="+s2.getName());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
