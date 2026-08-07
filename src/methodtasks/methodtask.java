package methodtasks;

public class methodtask {
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
	static int cube(int a) {
		return a*a*a;
	}
	static String greet(String name) {
		return name;
	}
	static String greet() {
		return "no title";
	}
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
