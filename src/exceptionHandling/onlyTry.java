package exceptionHandling;

public class onlyTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			int res = a / b;
		}
		finally {
			System.out.println("failed");
		}
	}

}
