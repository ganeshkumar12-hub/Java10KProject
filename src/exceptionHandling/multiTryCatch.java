package exceptionHandling;

public class multiTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = {1,2,3};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("message : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("message : "+e);
		}
		finally {
			System.out.println("program continues");
		}
	}

}
