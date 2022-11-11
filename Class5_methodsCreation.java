package assignment_11_6th;

public class Class5_methodsCreation {

	public static void main(String[] args) {

		Class5_methodsCreation b = new Class5_methodsCreation();
		b.array1();
		b.array2();
		b.array4();
		b.array5();
		array11();
		array12();
		array13();
		array14();
		array15();
		b.array3();

	}

	

	public void array1() {
		String[] a = { "one", "two", "three" };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void array2() {
		System.out.println();
		String a = " this is a string";
		a.split(a);
		for (int i = 0; i < 3; i++) {
			System.out.print(a + " ");
		}

	}

	public  void array3() {
		String[] cars = new String[4];
		cars[0] = "volvo";
		cars[1] = "nissan";
		cars[2] = "honda";
		cars[3] = "toyota";
		System.out.println(cars[3]);
	}

	public void array4() {
		int[] a = new int[4];
		a[0] = 11;
		a[1] = 21;
		a[2] = 31;
		a[3] = 41;
		System.out.println(a[3]);

	}

	public void array5() {

		int[][] a = new int[3][4];

		a[0][0] = 11;
		a[0][1] = 12;
		a[0][2] = 13;
		a[0][3] = 14;
		a[1][0] = 15;
		a[1][1] = 16;
		a[1][2] = 17;
		a[1][3] = 18;
		a[2][0] = 19;
		a[2][1] = 20;
		a[2][2] = 21;
		a[2][3] = 22;
		System.out.println(a[2][1]);

	}

	public static void array11() {
		int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(b[0][3]);

	}

	public static void array12() {
		String[][] vehicle = {{"volvo","jeep","hyndai"},{"blue","white","black"}};
		System.out.println(vehicle [1][2] +" "+ vehicle[0][2]);

	}

	public static void array13() {
		System.out.println("this is the array13 static method");

	}

	public static void array14() {
		System.out.println("this is the array14 static method");

	}

	public static void array15() {
		System.out.println("this is the static method15");

	}

}
