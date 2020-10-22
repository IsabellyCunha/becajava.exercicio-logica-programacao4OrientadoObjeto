package baskharaoo;

public class CalculoBaskhara {
	double delta, a, b, c, x1, x2;
	
	public void delta() {
		delta = (b*b) - (4*a*c);		
	}
	
	public void x1() {
		x1 = (-b + (Math.sqrt(delta)))/(2*a);
		System.out.println("O valor de x1: " + x1);
	}
	
	public void x2() {
		x2 = (-b - (Math.sqrt(delta)))/(2*a);
		System.out.println("O valor de x1: " + x2);
	}
}
