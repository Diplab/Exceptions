
public class DemoRestriction {
	public static void main(String[] args) {
	}
}

class ExceptionA extends Exception{}
class ExceptionB extends Exception{}
class ExceptionC extends Exception{}
class ExceptionD extends ExceptionA{}

abstract class ClassA {
	abstract void method() throws ExceptionA, ExceptionC;
}

interface InterfaceA{
	void method() throws ExceptionB;
}

interface InterfaceB{
	void method() throws ExceptionA;
}

class ClassB extends ClassA
{
	//(OK) void method() throws ExceptionA, ExceptionC {}
	//(OK) void method() throws ExceptionA{}
	//(OK) void method()
	//(OK) void method() throws ExceptionD{}
	@Override
	void method() throws ExceptionD{}
	
}

//(FAIL)
//abstract class ClassC extends ClassA implements InterfaceA{}
