package assignment_11_6th;

public class Class4_methodsCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class4_methodsCreation a = new Class4_methodsCreation();
		a.Method2();
		String sentence = a.firstMethod();
		System.out.println(sentence);
		a.Method3(10,"jhon" );
		a.Method4();
		a.Method5();
		Method11();
		Method12();
		Method13();
		Method14();
		Method15();

	}
	public String firstMethod() {
		
		return " this is a return type method";
	}
	public void Method2() {
		
		String  a = "this is a string ";
		System.out.println(a.charAt(8));
	}
	public void Method3(int num, String name) {
	
	System.out.println(num + " " + name);
		 
		
		
	}
	public void Method4() {

for (int i = 0; i<11; i++) {
	System.out.print(i + " ");} 

		
	}
	public void Method5() {
		System.out.println();
		System.out.println("this is the non static method5");
		
	}
	public static  void Method11() {
		System.out.println("this is the static method1");
		
	}
	public static  void Method12() {
		System.out.println("this is the static method2");
		
	}
	public static  void Method13() {
		System.out.println("this is the static method3");
		
	}
	public static  void Method14() {
		System.out.println("this is the static method4");
		
	}
	public static  void Method15() {
		System.out.println("this is the static method5");
		
	}


}
