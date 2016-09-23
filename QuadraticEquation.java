
public class QuadraticEquation {

	/*
	 * UML Diagram for QuadraticEquation Class
	 * 
	 * (class name)		QuadraticEquation
	 * 
	 * (data fields)	- a: int		// coefficient a
	 * 					- b: int		// coefficient b
	 * 					- c: int 		// coefficient c
	 * 					
	 * (constructors)	QuadraticEquation()
	 * 					A()
	 * 					B()
	 * 					C()
	 * 
	 * (methods)		getA(): static
	 * 					getB(): static
	 * 					getC(): static
	 * 					getDiscriminant()
	 * 					getRoot1()
	 * 					getRoot2()
	 * 
	 */
	

	
	// Construct a Stock object
	public QuadraticEquation() {
	}

	// coefficients
	private int a;
	private int b;
	private int c;
	
	// constructors
	
	private void a(){
		
	}
	
	private void b(){
	}
	
	private void c() {
	}
	

	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public double getDiscriminant(int a, int b, int c) {
		double test = (Math.pow(b, 2)) - (4 * a * c);
		if (test >= 0)
		{
			test = 1;
			return test;
		}
		else
		{
			test = 0;
			return test;
		}
	}
	
	public double getRoot1(int a, int b, int c) {
		double root1 = ( (-b) + (Math.sqrt((Math.pow(b, 2) ) - (4 * a * c) ) ) ) / (2 * a);
		return root1;
	}
	
	public double getRoot2(int a, int b, int c) {
		double root2 = ( (-b) - (Math.sqrt((Math.pow(b, 2) ) - (4 * a * c) ) ) ) / (2 * a);
		return root2;
	}		
}
