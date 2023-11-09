package JavaInicial;

import java.util.Scanner;

public class LacosCondicionaisIF {

	public static void main(String[] args) {
		
		float A, B, C, R;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro numero: ");
		A = leia.nextFloat();
		
		System.out.println("\n Digite o segundo numero: ");
		B = leia.nextFloat();
		
		System.out.println("\n Digite o terceiro numero: ");
		C = leia.nextFloat();
		
		R = A + B;
		
		if (C < R) {
		System.out.println("\n A soma de "+A+" + "+B+" é " +R+ " portanto maior que: " +C+ " ! ");
		}
		else if(C > R) {
			System.out.println("\n A soma de "+A+" + "+B+" é " +R+ " portanto menor que:  " +C+ " ! ");
		}
		else {
			System.out.println("\n A soma de "+A+" + "+B+" é " +R+ " portanto igual a: " +C+ " ! ");
		}
		
		
	}

}
