import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String rdo;
		int base;
		int altura;
		int radio;
		
		System.out.println("Cálculo de áres- Elige una figura geométrica:\n");
		System.out.println("a)Triángulo\n");
		System.out.println("b)Círculo\n");
		System.out.println("Que figura quieres calcular (escribe t o c)?");
		
		Scanner teclado = new Scanner (System.in);
		rdo=teclado.next();
		
		if(rdo.equals("t")) {
			
			System.out.println("Introduce la base: ");
			base=teclado.nextInt();
			System.out.println("Introduce la altura: ");
			altura=teclado.nextInt();
			
			int calculo=base*altura/2;
			
			System.out.println("El área del triágulo es: "+calculo);
			
		}
		else if (rdo.equals("c")) {
			
			System.out.println("Introduce el radio: ");
			radio=teclado.nextInt();
			double pi=3.14;
			double calculo=pi*(radio*radio);
			
			System.out.println("El área del circulo es: "+calculo);
			
			
		}
		
	}

}
