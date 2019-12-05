package com.elorrieta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio de proyecto");



		boolean finalizar = true;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("por favor, introduzca que operacion quiere realizar");
			System.out.println("A: sacar libro");
			System.out.println("B: devolver libro");
			System.out.println("S: salir");
			System.out.println("");
			System.out.println("Seleccione una opcion valida");
			char opcion = sc.nextLine().charAt(0);

			List<Libro> listaLibros = new ArrayList<Libro>();

			switch (opcion) {
			case 'A':
				listaLibros.remove(0);
				break;
			case 'B':listaLibros.add(new Libro("elsilmirillion", "a001"));
				break;
			case 'S':finalizar=false;
				break;

			}
		} while (finalizar);

	}

}
