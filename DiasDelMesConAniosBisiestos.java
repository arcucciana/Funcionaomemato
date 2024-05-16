package PAnioBisiesto;

import java.util.Scanner;

public class DiasDelMesConAniosBisiestos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el número del mes (1-12):");
		int mes = scanner.nextInt();

		System.out.println("Ingrese el año:");
		int anio = scanner.nextInt();

		int diasEnElMes = 0;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasEnElMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasEnElMes = 30;
			break;
		case 2:
			if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
				diasEnElMes = 29;
			} else {
				diasEnElMes = 28;
			}
			break;
		default:
			System.out.println("Número de mes inválido");
			return;
		}

		System.out.println("El mes " + mes + " del año " + anio + " tiene " + diasEnElMes + " días.");

		scanner.close();
	}
}
