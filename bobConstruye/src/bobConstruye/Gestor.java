package bobConstruye;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa ca1 = new Casa(null, null, 0, null);
		Apartamento apt = new Apartamento(null, null, 0, 0);
		System.out.println("ingrese los metros cuadrados de la casa");
		double mt = sc.nextDouble();
		System.out.println("inrese la direccion");
		String direc = sc.nextLine();
		sc.nextLine();
		System.out.println("ingrese la cantidad de habitaciones");
		int hb = sc.nextInt();
		sc.nextLine();
		System.out.println("ingrese el color de la casa");
		String col = sc.nextLine();
		altaCasa(ca1,mt,direc,hb,col);
		System.out.println("ingrese los metros cuadrados del apartamento");
		double mtAp = sc.nextDouble();
		System.out.println("inrese la direccion");
		String direcAp = sc.nextLine();
		sc.nextLine();
		System.out.println("ingrese el piso el apartamento");
		int pisoAp = sc.nextInt();
		System.out.println("ingrese el numero del apartamento");
		int nro = sc.nextInt();
		 altaApt(apt,mtAp,direcAp,pisoAp,nro);
		 listarCoso(apt, ca1);
		 

	}

	public static void altaCasa(Casa c, double mt, String direc, int hb, String col) {

		c = new Casa(mt, direc, hb, col);

	}
	
	
	public static void altaApt(Apartamento apt, double mt, String direc, int pi, int nroApt) {

		apt = new Apartamento(mt, direc, pi, nroApt);

	}

	public static void listarCoso(Apartamento apt,Casa ca) {
		
		System.out.println("la casa tiene " + ca.getMtCuadrados()+" metros cuadrados, la direccion es  " + ca.getDireccion() + " tiene " + ca.getHabitaciones() + "habitaciones y es de color " + ca.getColor() );
		System.out.println("el apartamento tiene  " + apt.getMtCuadrados()+" metros cuadrados, la direccion es  " + apt.getDireccion() + " esta en el piso " + apt.getPiso()+ "el numero del apt es " + apt.getNroApt());
		
	}
}