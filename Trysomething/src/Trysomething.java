import java.util.zip.DataFormatException;

class a extends Exception{}
class b extends ClassNotFoundException{}
class c extends CloneNotSupportedException{}
class d extends DataFormatException{}


public class Trysomething {

	public void f() throws a{
		System.out.println("Throw a from f()");
		throw new a();	
	}
	public void g() throws b{
		System.out.println("Throw b from g()");
		throw new b();
	}	
	public void h() throws c{
		System.out.println("Throw c from h()");
		throw new c();
	}	
	public void j() throws d{
		System.out.println("Throw d from j()");
		throw new d();
	}	
	
	
	public static void main(String[] args) {
		
		Trysomething tryy = new Trysomething();
		
		try{
			
			tryy.g();
			tryy.h();
			tryy.j();
		} catch(b e) {
			System.out.println("get b from g()");
		} catch(c e) {
			System.out.println("get c from h()");
		} catch(d e) {
			System.out.println("get d from j()");
		}finally{
			System.out.println("This will always been print out");
		}
		
	}

}
