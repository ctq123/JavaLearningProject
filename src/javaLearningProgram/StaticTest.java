package javaLearningProgram;

public class StaticTest {
	
	public static class Animal{
		public void printName(){
			System.out.println("my name is Animal");
		}
		//static method
		public static void info(){
			System.out.println("Animal info");
		}
	}
	
	public static class Dog extends Animal{
		public void printName(){
			System.out.println("my name is Dog");
		}
		//static method
		public static void info(){
			System.out.println("Dog info");
		}
	}
	
	public static void main(String[] args){
		Animal a = new Animal();
		Animal a2 = new Dog();
		Dog dog = new Dog();
		a.printName();
		a2.printName();
		
		//real to understand what the mean of static
		a.info();
		a2.info();//Animal info
		dog.info();//Dog info
	}

}
