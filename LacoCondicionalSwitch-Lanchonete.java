package JavaInicial;

import java.util.Scanner;

public class LacoCondicionalSwitchLanchonete {

	public static void main(String[] args) {
		
		int op;
		float un;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.println("\n \t\t !! CARDAPIO LANCHONTE !! ");
		System.out.println("\n \t S2 ESCOLHA O NUMERO DO PRODUTO QUE DESEJA S2");
		System.out.println("\n	|1| |||| CACHORRO QUENTE |||| R$10,00");
		System.out.println("\n	|2| |||| X-SALADA |||| 15,00");
		System.out.println("\n	|3| |||| X-BACON |||| R$18,00");
		System.out.println("\n	|4| |||| BAURU |||| R$12,00");
		System.out.println("\n	|5| |||| REFRIGERANTE |||| R$8,00 ");
		System.out.println("\n	|6| |||| SUCO DE LARANJA |||| R$13,00 ");
		op = leia.nextInt();
		
		System.out.println("\n \t\tQUANTAS UNIDADES DESEJA COMPRAR? ");
		un = leia.nextInt();
		
		
		
		switch(op) {
		case 1: 
			System.out.println("\n |||| "+un+" UNIDADES DE CACHORRO QUENTE |||| TOTAL DA COMPRA: "+(un * 10)+"R$||||");
			break;
		case 2:
				System.out.println("\n |||| "+un+" UNIDADES DE X-SALADA |||| TOTAL DA COMPRA: "+(un * 15)+"R$||||");
				break;
		case 3:
				System.out.println("\n |||| "+un+" UNIDADES DE X-BACON |||| TOTAL DA COMPRA: "+(un * 18)+"R$||||");
				break;
		case 4:
				System.out.println("\n ||||  3"+un+" UNIDADES DE BAURU |||| TOTAL DA COMPRA: "+(un * 12)+"R$||||");
				break;
		case 5:
				System.out.println("\n ||||  "+un+" UNIDADES DE REFRIGERANTE |||| TOTAL DA COMPRA: "+(un * 8)+"R$||||");
				break;
		case 6:
			System.out.println("\n |||| "+un+" UNIDADES DE SUCO DE LARANJA |||| TOTAL DA COMPRA: "+(un * 13)+"R$||||");
			break;
			}
		
		
		

	}

}
