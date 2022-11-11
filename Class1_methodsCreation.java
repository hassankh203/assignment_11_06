package assignment_11_6th;


/*Create 5 Classes
Each class should have 5 static methods and 5 non static methods
Each class should have 2 different objects
Call the static methods directly and using classname
Call the non-static methods using both the object references*/


public class Class1_methodsCreation {

	public static void main(String[] args) {
		staticMethod1();
		staticMethod2();
		staticMethod3();
		staticMethod4();
		staticMethod5();
		Class1_methodsCreation a = new Class1_methodsCreation();
		a.nonStaticMethod1();
		a.nonStaticMethod2();
		a.nonStaticMethod3();
		a.nonStaticMethod4();
		a.nonStaticMethod5();
		a.staticMethod1();

		// 

	}
	
	public void nonStaticMethod1() {
		System.out.println("this is the non static method1");
		
	}
	public void nonStaticMethod2() {
		System.out.println("this is the non static method2");
		
	}
	public void nonStaticMethod3() {
		System.out.println("this is the non static method3");
		
	}
	public void nonStaticMethod4() {
		System.out.println("this is the non static method4");
		
	}
	public void nonStaticMethod5() {
		System.out.println("this is the non static method5");
		
	}
	public static  void staticMethod1() {
		System.out.println("this is the static method1");
		
	}
	public static  void staticMethod2() {
		System.out.println("this is the static method2");
		
	}
	public static  void staticMethod3() {
		System.out.println("this is the static method3");
		
	}
	public static  void staticMethod4() {
		System.out.println("this is the static method4");
		
	}
	public static  void staticMethod5() {
		System.out.println("this is the static method5");
		
	}

}
