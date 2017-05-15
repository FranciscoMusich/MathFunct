
public class MathFunct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime;
		long endTime;
		double Time; 
		startTime = System.currentTimeMillis();
		double base, height, area;
		base = 10;
		height = 5;
		area = (base * height)/2;
		System.out.println("El area es = " + area);
		double randomNum; 
		randomNum = Math.random();
		System.out.println("Numero al Azar = "+ randomNum);
		System.out.println("Este es el numero PI" + Math.PI);
		endTime = System.currentTimeMillis();
		Time = (endTime - startTime)/1000;
		System.out.println("El tiempo de operacion fue = " + Time);
		System.out.println("Cambio");
		
		
				
			

	}

}
