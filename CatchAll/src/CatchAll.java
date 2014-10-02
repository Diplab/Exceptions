

public class CatchAll {
	
		static int a;
		static int b;
		static int c;
	public static void main(String[] args) {
		
			a=100;
		try
		{ 
			System.out.println("Enter a div number");
			b=0;
			c=a/b; 
		}
		catch(NullPointerException e)
		{
			System.out.println("The number "+b);
		} 
		catch(Exception e)
		{
			System.out.println("Something else happened");
		} 
		finally
		{
		}
		
	}

}
