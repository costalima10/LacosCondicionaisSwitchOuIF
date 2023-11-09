package JavaInicial;

import java.util.Scanner;

public class LacosCondicionaisPARouIMPAR {

	public static void main(String[] args) {
		
		float n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n DIGITE UM NUMERO: ");
		n1 = leia.nextFloat();
		
		if(n1 %2==0 && n1>0 ) {
			System.out.println("\nO numero "+n1+" é par e positivo !");
		}
		else if(n1 %2==0 && n1<0) {
			System.out.println("\nO numero "+n1+" é par e negativo !");
		}
		else if(n1 %2==1 && n1>0) {
			System.out.println("\nO numero "+n1+" é impar e positivo !");
		}
		else{
			System.out.println("\nO numero "+n1+" é impar e negativo !");
		}
		
	}

}
