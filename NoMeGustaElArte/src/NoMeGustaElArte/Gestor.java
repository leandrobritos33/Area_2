package NoMeGustaElArte;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pintura pint = new Pintura(null, null);
		Escultura esc = new Escultura(null, null);
		Fotografia foto = new Fotografia(null, null);
		System.out.println("ingrese el autor de la pintura");
		String auP = sc.nextLine();
		System.out.println("ingrese el lienzo de la pintura");
		String liP = sc.nextLine();
		altaPintura(pint,auP,liP);
		System.out.println("ingrese el autor de la estructura");
		String auEsc = sc.nextLine();
		System.out.println("ingrese el material de la escultura");
		String mat = sc.nextLine();
		altaEScultura(esc,auEsc,mat);
		System.out.println(" ingrese el autor de la fotografia ");
		String auFo = sc.nextLine();
		System.out.println("la resolucion de la foto es");
		String resolucion = sc.nextLine();
		altaFotografia(foto,auFo,resolucion);
		listarCoso(foto,pint,esc);

	}

	public static void altaPintura(Pintura pint, String au, String lienzo) {

		pint.setAutor(au);
		pint.setLienzo(lienzo);
	}

	public static void altaEScultura(Escultura esc, String au, String material) {
		esc.setAutor(au);
		esc.setMaterial(material);
	}

	public static void altaFotografia(Fotografia foto, String au, String Resolucion) {
		foto.setAutor(au);
		foto.setResolucion(Resolucion);

	}

	public static void listarCoso(Fotografia foto, Pintura pint, Escultura esc) {
		System.out.println("el autor de la pintura es" + pint.getAutor() + " y el lienzo es " + pint.getLienzo());
		System.out.println("el autor es " + esc.getAutor() + " el material de la escultura es " + esc.getMaterial());
		System.out.println("el autor de la foto es " + foto.getAutor() + " la resolucion es de " + foto.getResolucion());

	}

}
