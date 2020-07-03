import java.util.Scanner;

import entidades.CalculaEmDias;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÁLCULO DA IDADE EM DIAS");
		System.out.println();

		CalculaEmDias idadeEmDias = new CalculaEmDias();
		
		System.out.print("Idade em anos: ");
		int anos = sc.nextInt();
		idadeEmDias.setAnos(anos);
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		idadeEmDias.setMeses(meses);
		System.out.print("Dias: ");
		int dias = sc.nextInt();
		idadeEmDias.setDias(dias);

		System.out.println(idadeEmDias);
		
		sc.close();
	}
}
