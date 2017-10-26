package app;

import java.util.Iterator;

import linkedlist.linkedlist;

public class App {
	public static void main(String[] args) {
		linkedlist<String> names = new linkedlist<String>();
		linkedlist<Integer> ages = new linkedlist<Integer>(19);
		
		//Agregar al inicio de la lista
		System.out.println("Lista original:");
		System.out.println();
		names.AddStart("Ana");
		names.AddStart("Jose Arturo");
		
		
		//Agregar al final de la lista
		names.AddEnd("Hiram");
		names.AddEnd("Ricardos");
		
		//ages.AddEnd(29);
		
		//Agregar antes de un valor
		ages.AddBefore(19,15);
		
		names.AddBefore("Ricardos", "Frodo");
		names.AddBefore("Frodo", "Angela");
		//Agregar despues de un valor
		names.AddLast("Ricardos", "Ang");
		
		//Imprimir
		names.printer();	
		
		System.out.println();
		
		//Indice del valor
		System.out.println("Indice del valor Frodo");
		names.indexOf("Frodo");
		
		//Tamaño de la lista
		System.out.println("Tamaño de la lista original");
		names.size();
		System.out.println(".............");
		System.out.println();
		
		
		
		//Remplazar valor
		System.out.println("Valor de Ana remplazado por Andrea:"); 
		names.replace("Ana", "Andrea");
		
		names.printer();
		System.out.println();
		System.out.println(".............");
		//Obtener primer valor de la lista
		System.out.println("Primer valor de la lista:");
		names.getFirst();
		System.out.println();
		
		//Obtener ultimo valor de la lista
		System.out.println("Ultimo valor de la lista:");
		names.getLast();
		System.out.println();
		System.out.println(".............");
		
				
		//Eliminar depues de un valor
		System.out.println("Eliminar valor siguiente de Ricardos");
		names.removeAfter("Ricardos");
		
		names.printer();
		System.out.println();
		System.out.println(".............");
		//Eliminar antes de un valor
		System.out.println("Eliminar valor anterior a Andrea");
		names.removeBefore("Andrea");
		names.printer();
		System.out.println();
		System.out.println(".............");
		//Eliminar primer valor
		System.out.println("Eliminar primer valor de la lista");
		names.removeFirst();
		names.printer();
		System.out.println(".............");
		//Eliminar ultimo valor
		System.out.println();
		System.out.println("Eliminar ultimo valor de la lista");
		names.removeLast();
		names.printer();
		System.out.println();
		System.out.println("Tamaño de la lista");
		names.size();
		System.out.println();
		
		//Eliminar de la lista
		System.out.println();
		System.out.println(".............");
		System.out.println("Eliminar un valor de la lista");
		names.remover("Hiram");
		
		//Tamaño de la lista
		
		names.printer();
		System.out.println("Tamaño de la lista:");
		names.size();
		System.out.println();
		//Vaciar lista
		
		names.clear();
		System.out.println("Tamaño de la lista luego de utilizar clear");
		names.size();
		names.printer();
		
		System.out.println("-------------");
		
		
		
	}

}
