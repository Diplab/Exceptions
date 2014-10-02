
class MyException extends Exception{
	public MyException(){}
	public MyException(String msg){
		super(msg);
	}
}

public class ExceptionsWithString {

		public void f() throws MyException{
			System.out.println("Throw MyException from f()");
			throw new MyException();			
		}
		
		public void g() throws MyException{
			System.out.println("Throw MyException from g()");
			throw new MyException("There is a problem");
		}
		
		public static void main(String[] args) {
			ExceptionsWithString sed = new ExceptionsWithString();
			
			try{
				sed.f();
								
			}catch(MyException e){
				e.printStackTrace(System.out);
			}
			
			try{
				sed.g();
			}catch(MyException e){
				e.printStackTrace(System.out);
			}
		}
	

}
