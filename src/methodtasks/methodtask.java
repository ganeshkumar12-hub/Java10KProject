package methodtasks;

public class methodtask {
	//task 1
	static int maxofthree(int a, int b, int c) {
		if(a>b) {
			return a;
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	//task 2
	static int cube(int a) {
		return a*a*a;
	}
	//task 3
	static String greet(String name) {
		return name;
	}
	static String greet() {
		return "no title";
	}
	//task 4
	static int recursivemethod(int n) {
		return n*((n+1))/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("cube of a number : "+cube(3));
		System.out.println("max of three numbers : "+maxofthree(2,10,4));
		System.out.println("sum of 1 to n : "+recursivemethod(4));
		System.out.println("greet method with title : "+ greet("Ganesh"));
		System.out.println("greet method without title : "+ greet());
	} 

}
