package tema13;

import java.util.ArrayList;
import java.util.Scanner;

public class ProbarArrayList {
	public static Scanner sc = new Scanner(System.in);
	
	public static int seleccionMenu(){
		System.out.println("GESTION DE ALUMNO");
		System.out.println("------------------");
		System.out.println("1. Añadir");
		System.out.println("2. Consultar");
		System.out.println("3. Borrar");
		System.out.println("4. Modificar");
		System.out.println("5. Listar");
		System.out.println("6. Filtrar");
		System.out.println("7. Fin");
		int opSeleccionada;
		
		System.out.print("Seleccione una opcion ");
		opSeleccionada = Integer.parseInt(sc.nextLine());
		while(opSeleccionada < 1 || opSeleccionada > 7){
			System.out.println("Dato no valido");
			System.out.print("Seleccione una opcion ");
			opSeleccionada = Integer.parseInt(sc.nextLine());
		}
		return opSeleccionada;

	}
	public static Alumno addAlumno(){
		System.out.println("Añadir alumno");
		System.out.print("nMatricula ");
		int nm = Integer.parseInt(sc.nextLine());
		System.out.print("Nombre ");
		String n = sc.nextLine();
		System.out.print("Curso ");
		String c = sc.nextLine();
		return new Alumno(nm,n,c);
	}
	public static void mostrarLista(ArrayList<Alumno> listado){
		for(int i = 0;i < listado.size();i++){
			System.out.println(listado.get(i));	
		}
	}
	public static void consultarAlumno(int nMatricula, ArrayList<Alumno> listado){
		for(int i = 0;i < listado.size();i++){
			if(listado.get(i).getnMatricula()==nMatricula){
			System.out.println(listado.get(i));
			}
		}
	}  
	public static void main(String[] args) {
		ArrayList<Alumno> listado = new ArrayList<Alumno>();
		listado.add(new Alumno(1,"Pepe","1DAW"));
		listado.add(new Alumno(3,"Ana","1DAW"));
		listado.add(new Alumno(5,"Carlos","2DAW"));
		listado.add(new Alumno(4,"Marta","1DAW"));
		listado.add(new Alumno(5,"Fernando","2DAW"));
		do{
			int opSeleccionada = seleccionMenu();
			if(opSeleccionada == 7){
				break;
			}
			switch(opSeleccionada){
			case 1:
				listado.add(addAlumno());
				System.out.println(listado.get(listado.size()-1));	
				break;
			case 2:
				System.out.print("Numero de matricula? ");
				int nAlumnoBuscado = Integer.parseInt(sc.nextLine());
				consultarAlumno(nAlumnoBuscado, listado);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				mostrarLista(listado);
				break;
			case 6:
				break;
			}
		}while(true);
	}
}
