package interfase;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Perro perro1 = new Perro("benjamin");
		dinosaurio dino1 = new dinosaurio("mateo");

		int op = 0;
		do {
			System.out.println("1 pa dormir al perro");
			System.out.println("2 para que coma");
			System.out.println("3 para poner a dormir al dinosaurio");
			System.out.println("4 para que el dinosaurio te coma");
			op = sc.nextInt();
			switch (op) {
			case 1: {
				perro1.dormir();
				;
				break;
			}
			case 2: {
				perro1.comer();
				break;
			}
			case 3: {
				dino1.dormir();
				break;
			}
			case 4: {
				dino1.comer();
				break;
			}

			case 5: {
				op = 5;
			}

			default:

			}

		} while (op != 5);

	}

}
