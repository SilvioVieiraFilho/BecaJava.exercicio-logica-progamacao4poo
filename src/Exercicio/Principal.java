package Exercicio;

public class Principal {
	
	public static void main(String[] args) {
		
		Exercicio4 obj = new Exercicio4();
		
		
		
		obj.setA(40);
		obj.setB(obj.getB());
		obj.setC(obj.getC());
		
		
		obj.bhaskara();
		
		
		

		System.out.println(""+obj.getA() );
		
		
	}
	
	
	

}
