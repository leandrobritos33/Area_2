package supermercado;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		Electronica[] elec = new Electronica[10];
		Ropa[] ropa = new Ropa[10];
		Alimento[] al = new Alimento[10];

		do {
			System.out.println("bienvenido al programa");
			System.out.println("ingresa 1 para ingesar un Electronico");
			System.out.println("ingresa 2 para ingesar ropa");
			System.out.println("ingresa 3 para ingesar un alimento");
			System.out.println("ingrese 4 para ver los prductos ingresados");
			System.out.println("ingrese 5 para salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("ingrese el precio");
				double pr = sc.nextDouble();
				System.out.println("ingrese la marca");
				String ma = sc.nextLine();
				sc.nextLine();
				System.out.println("ingrese  el modelo");
				String mo = sc.nextLine();
				System.out.println("ingrese el voltaje");
				int vol = sc.nextInt();
				altaElectronica(elec, pr, ma, mo, vol);
				break;

			case 2:
				System.out.println("ingrese el precio");
				double pre = sc.nextDouble();
				System.out.println("ingrese la marca");
				String mar = sc.nextLine();
				sc.nextLine();
				System.out.println("ingrese el color");
				String col = sc.nextLine();
				System.out.println("ingrese el talle");
				int tal = sc.nextInt();
				altaRopa(ropa, pre, mar, col, tal);
				break;

			case 3:
				System.out.println("ingrese el precio");
				double prec = sc.nextDouble();
				System.out.println("ingrese la marca");
				String marc = sc.nextLine();
				sc.nextLine();
				System.out.println("ingrese el tipo de alimento");
				String tipo = sc.nextLine();
				System.out.println("ingrese la fecha de vencimiento");
				String venc = sc.nextLine();
				altaAlimento(al, prec, marc, tipo, venc);
				break;
			case 4:
				listarProductos(elec,ropa,al);
				break;
			case 5:
				opcion = 5;
				break;
			default:
				System.out.println("ERROR seleccione una opcion valida");
			}

		} while (opcion != 5);

	}

	public static void altaElectronica(Electronica[] elec, double pr, String ma, String mo, int vol) {

		for (int i = 0; i < elec.length; i++) {

			if (elec[i] == null) {
				elec[i] = new Electronica(pr, ma, mo, vol);

				break;
			} else {

			}
		}

	}

	public static void altaRopa(Ropa[] ro, double pre, String mar, String col, int tal) {

		for (int i = 0; i < ro.length; i++) {

			if (ro[i] == null) {
				ro[i] = new Ropa(pre, mar, col, tal);

				break;
			} else {

			}
		}
	}

	public static void altaAlimento(Alimento[] al, double prec, String marc, String tipo, String venc) {
		for (int i = 0; i < al.length; i++) {

			if (al[i] == null) {
				al[i] = new Alimento(prec, marc, tipo, venc);

				break;
			} else {

			}
		}
	}

	public static void listarProductos(Electronica[] elec, Ropa[] ro, Alimento[] al) {

		for (int i = 0; i < elec.length; i++) {
			if (elec[i] != null) {
				System.out.println(
						"el precio del producto es " + elec[i].getPrecio() + " la marca  es" + elec[i].getMarca()
								+ "el modelo es " + elec[i].getModelo() + " el voltaje es" + elec[i].getVoltaje());
				break;
			}

		}

		for (int i1 = 0; i1 < elec.length; i1++) {
			if (ro[i1] != null) {
				System.out.println("el precio del producto es " + ro[i1].getPrecio() + " la marca  es"
						+ ro[i1].getMarca() + "el color es " + ro[i1].getColor() + " el talle  es" + ro[i1].getTalle());

			}

		}
		for (int i2 = 0; i2 < elec.length; i2++) {
			if (al[i2] != null) {
				System.out.println("el precio del producto es " + al[i2].getPrecio() + " la marca  es"
						+ al[i2].getMarca() + "el tipo de alimento es" + al[i2].getTipoAlimento()
						+ " el vencimiento  es" + al[i2].getVencimiento());

			}
		}
	}
}
