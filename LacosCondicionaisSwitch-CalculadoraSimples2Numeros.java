package JavaInicial;

import java.util.Scanner;

public class LacosCondicionaisSwitchCalculadoraSimples2Numeros {

	public static void main(String[] args) {
		float n1,n2,r;
		int op;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDIGITE O PRIMEIRO NUMERO: " );
		n1=leia.nextFloat();
		
		System.out.println("\nDIGITE O SEGUNDO NUMERO: " );
		n2=leia.nextFloat();
		
		System.out.println("\nESCOLHA UMA OPERAÇÃO ");
		System.out.println("\n1- 	SOMA  ");
		System.out.println("\n2-	SUBTRAÇÃO  ");
		System.out.println("\n3-	MULTIPLICAÇÃO  ");
		System.out.println("\n4-	DIVISÃO  ");
		op = leia.nextInt();
		
		
		switch(op) {
		case 1: 
			System.out.println("\n A SOMA DE "+n1+" + "+n2+" é : "+(n1+n2)+" !! ");
			break;
		case 2:
				System.out.println("\n A SUBTRAÇÃO DE "+n1+" - "+n2+" é : "+(n1-n2)+" !! ");
				break;
		case 3:
				System.out.println("\n A MULTIPLICAÇÃO DE "+n1+" X "+n2+" é : "+(n1*n2)+" !! ");
				break;
		case 4:
				System.out.println("\n A DIVISÃO DE "+n1+" / "+n2+" é : "+(n1/n2)+" !! ");
				break;
			default:
				   System.out.println("\nOpçao Invalida!!!");
				   
	
		}
		
		}

}
