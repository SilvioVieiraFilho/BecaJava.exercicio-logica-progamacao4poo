package Exercicio;

import java.util.Scanner;

public class Exercicio4 {
	
	private double delta;
	private double x1;
	private double x2;
	

	private  double a;
	private double b;
	private double c;
	
	
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}



	Scanner s = new Scanner(System.in);

	public Scanner getS() {
		return s;
	}
	public void setS(Scanner s) {
		this.s = s;
	}
	public double getDelta() {
		return delta;
	}
	public void setDelta(double delta) {
		this.delta = delta;
	}
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	
	
	public void bhaskara() {
		
		

		
		System.out.println("Digite o numero letra A");
		double a = s.nextDouble();
		System.out.println("Digite o numero letra B");
		double b = s.nextDouble();
		System.out.println("Digite o numero letra C");
		double c = s.nextDouble();
		
		 delta = (b * b) -(4 * (a * c)) ; 
		 
		System.out.println( "valor delta:"+delta);
		
		if(delta < 0) {
		System.out.println(" o Valor de delta é zero ");
		}
		else{
			
			x1 =  (-b  + Math.sqrt(delta)) / (2. * a );
			
			x2 = (-b  - Math.sqrt(delta)) / (2. * a );
			
			System.out.println("valor x1:"+ x1 +" "+"valor x2:"+ x2);
		}
			
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}	
