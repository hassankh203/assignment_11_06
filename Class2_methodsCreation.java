package assignment_11_6th;


public class Class2_methodsCreation {

	public static void main(String[] args) {
		Class2_methodsCreation a = new Class2_methodsCreation();
		a.nonStaticMethod1();
		a.nonStaticMethod2();
		a.nonStaticMethod3();
		a.nonStaticMethod4();
		a.nonStaticMethod5();
		staticMethod1();
		staticMethod2();
		staticMethod3();
		staticMethod4();
		staticMethod5();
	}
	
	public void nonStaticMethod1() {
		System.out.print("this is the non static method1  ");
		int i = 0;
		while (i<5) {
			System.out.print(i);
					i++;
					
		}

	}
	public void nonStaticMethod2() {
		System.out.println();
		System.out.print("this is the non static method2 ");
		int j = 5;
		while (j>0) {
			System.out.print(j);
			j--;}
	}
	public void nonStaticMethod3() {
		System.out.println("this is the non static method3");
		int k = 0;
		while (k<7) {
			System.out.print(k);
			k++;
		}
		
	}
	public void nonStaticMethod4() {
		System.out.println("this is the non static method4");
		for (int i=0; i<5; i++) {
			for (int j = 0; j<5;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	}
	public void nonStaticMethod5() {
		System.out.println("this is the non static method5");
		for (int i=0; i<5; i++) {
			for (int j = 0; j<i;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	}
	public static  void staticMethod1() {
		System.out.println("this is the static method1");
		for (int i=5; i>0; i--) {
			for (int j = 5; j>i;j--) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	}
	public static  void staticMethod2() {
		System.out.println("this is the static method2");
		String s = "this is the string sentence";
		System.out.println(s.charAt(8));
	}
	public static  void staticMethod3() {
		System.out.println("this is the static method3");
		int[][] a = {{1,2,3,4},{23,34,56,78}};
		for (int i = 0 ; i <a.length; i++) {
			for (int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");}


				System.out.println();
			}
			System.out.println();
		
	}
	public static  void staticMethod4() {
		System.out.println("this is the static method4");
		
	}
	public static  void staticMethod5() {
		System.out.println("this is the static method5");
		
	}

}
