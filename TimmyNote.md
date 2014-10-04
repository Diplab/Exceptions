Yu-Ting Chen's Note
==

# Content
- [Assertion](#assertion)

# Assertion
See the [**Oracle Documentation**][Programming With Assertions].

- The assertion statement has two forms:
	1. `assert Expression1 ;`
	2. `assert Expression1 : Expression2 ;`
- Expression1 is false: throws an `AssertionError`
- Expression2 is detail message.
- Now, see the *DemoAssertionError* example below. Run the example with `-ea` option.
	

	```java
	public class DemoAssertionError {

		public static void main(String[] args) {
			//run with -ea option and get
			//Exception in thread "main" java.lang.AssertionError: HI
			//at DemoAssertionError.main(DemoAssertionError.java:5)
			assert false : "HI";
		}

	}
	```
- There are also situations where you should **not** use them:
	+ for argument checking in public methods.
	+ to do any work that your application requires for correct operation.
		```java
		// Broken! - action is contained in assertion
		assert names.remove(null);

		// Fixed - action precedes assertion
		boolean nullsRemoved = names.remove(null);
		assert nullsRemoved;  // Runs whether or not asserts are enabled
		```
- There are many situations where it is good to use assertions, including:
	+ Internal Invariants
		* Below may fail if i is negative, as the % operator is not a true modulus operator, but computes the remainder, which may be negative.
		
			```java
			public class ModAssertionExample {

				public static void main(String[] args) {
					System.out.println((-1) % 3);
					int i = -1;
					if (i % 3 == 0) {

					} else if (i % 3 == 1) {

					} else {
						assert i % 3 == 2 : i;
					}
				}

			}
			```
		* Another good candidate for an assertion is a switch statement with no default case. 
			```java
			default:
			    assert false : suit;
			```
	+ Control-Flow Invariants
		* place an assertion at any location you assume will not be reached.
			```java
			void foo() {
			    for (...) {
			      if (...)
			        return;
			    }
			    assert false; // Execution should never reach this point!
			}
			```
	+ Preconditions, Postconditions, and Class Invariants
		* Preconditions — what must be true when a method is invoked.
			- Lock-Status Preconditions — preconditions concerning whether or not a given lock is held.
		* Postconditions — what must be true after a method completes successfully.
		* Class invariants — what must be true about each instance of a class.


# Reference
- [Programming With Assertions][Programming With Assertions]


[Programming With Assertions]: http://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html