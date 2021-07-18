package Metodos;

import java.util.Hashtable;

import Clases.*;

public class Metodos {
//	**** TAREA 1 ****
		public static void metodoTarea1() {
//			Creamos un array de electrodomesticos con 10 objetos
			Electrodomestico[] electrodomesticos = {new Electrodomestico(500, "negro", 'Z', 80), 
													new Lavadora(),
													new Television(800, "gris", 'A', 20, 60, true),
													new Electrodomestico(400, "rojo", 'D', 10), 
													new Lavadora(650, "marron", 'D', 60, 10),
													new Television(),
													new Electrodomestico(), 
													new Lavadora(1200, "negro", 'A', 100, 30),
													new Television(2000, "negro", 'A', 30, 60, true),
													new Television(300, "blanco", 'E', 8, 20, false)
													};
			
			int precioTotal = 0;
			int precioLavadoras = 0;
			int precioTeles = 0;
			
//			Recorremos el array, comprobamos el tipo de objeto con instanceof y sumamos el precio a la variable correspondiente
				for (int i = 0; i < electrodomesticos.length; i++) {
//					System.out.println(electrodomesticos[i].precioFinal());
					if(electrodomesticos[i] instanceof Lavadora) {
						precioLavadoras += electrodomesticos[i].precioFinal();
					} else if (electrodomesticos[i] instanceof Television) {
						precioTeles += electrodomesticos[i].precioFinal();
					}
					precioTotal += electrodomesticos[i].precioFinal();
				}
				
				System.out.println("Precio total: "+precioTotal+" €");
				System.out.println("Precio lavadoras: "+precioLavadoras+" €");
				System.out.println("Precio televisores: "+precioTeles+" €");
		}
		
//		**** TAREA 2 ****
		public static void metodoTarea2() {
//			Creamos dos arrays de series y videojuegos con 5 objetos cada uno
				Serie[] series = {new Serie("Fleabag", 2, "Comedia Dramática", "Phoebe Waller-Bridge"), 
						new Serie(),
						new Serie("Juego de Tronos", 8, "Fantasía", "David Benioff & D.B. Weiss"),
						new Serie("The Witcher", 1, "Fantasía", "Lauren Schmidt Hissrich"), 
						new Serie("Westworld", "Jonathan Nolan & Lisa Joy")
						};
				
				Videojuego[] videojuegos = {new Videojuego("God of War", 21, "Acción", "Santa Monica Studio"), 
						new Videojuego(),
						new Videojuego("The Legend of Zelda: Majora's Mask", 20, "Acción/Fantasía", "Nintendo EAD"),
						new Videojuego("The Witcher 3: Wild Hunt", 51, "Acción/Fantasía", "CD Projekt Red"), 
						new Videojuego("Portal 2", 8, "Puzzles", "Valve")
						};
				
//				Entregamos algunas series y videojuegos
				series[2].entregar();
				series[4].entregar();
				videojuegos[2].entregar();
				videojuegos[3].entregar();
				videojuegos[4].entregar();
				
				int numS = 0;
				int numV = 0;
				Serie masTemp = series[0];
				Videojuego masHoras = videojuegos[0];
				
//				Bucle para contar series y videojuegos entregados
//				y encontrar el videojuego con mas horas y la serie con mas temporadas
				for (int i = 0; i < videojuegos.length; i++) {
//					Comprobamos que series y videojuegos estan entregados
					if(series[i].isEntregado()) {
						numS++;
						series[i].devolver();
					}
					
					if(videojuegos[i].isEntregado()) {
						numV++;
						videojuegos[i].devolver();
					}
					
//					Comparamos las series y videojuegos para encontrar y guardar
//					las que tienen mas horas/temporadas
					masTemp = (Serie) masTemp.compareTo(series[i]);
					masHoras = (Videojuego) masHoras.compareTo(videojuegos[i]);
				}
				
				System.out.println("Hay un total de "+numS+" series entregadas y "+numV+" videojuegos entregados.");
				System.out.println("La serie con más temporadas es "+masTemp.getTitulo());
				System.out.println("El videojuego con más horas estimadas es "+masHoras.getTitulo());

		}
		
//		**** TAREA 3 ****	
		public static void metodoTarea3() {
			Libro libro1 = new Libro("9780756405892", "El nombre del viento", "Patrick Rothfuss", 873);
			Libro libro2 = new Libro("9786073105941", "El temor de un hombre sabio", "Patrick Rothfuss", 1190);
			System.out.println(libro1+"\n"+libro2);
			libro1.masPaginas(libro2);
		}
		
//		**** TAREA 4 ****
		public static void metodoTarea4(){
			Raices raiz1 = new Raices(2,-6,4);
			raiz1.calcular();
		}
		
//		**** TAREA 5 ****
		public static void metodoTarea5() {
			String[] materias = {"matemáticas", "filosofía", "física"};
			Aula[] aulas = new Aula[3];
			int aforo = 0;
			
//			Creamos aulas y a su vez los profesores y alumnos
			for (int i = 0; i < aulas.length; i++) {
//				variable para el aforo con un rango entre 25 y 30
				aforo = (int)(Math.random()*(30-25+1)+25);
				aulas[i] = new Aula(i, materias[i], aforo, crearProfe(materias[i]), crearAlumnos(aforo, materias[i]));	
			}
			
			displayAulas(aulas);
			
		}
		
//		Método para crear profesores con datos semi aleatorios
		private static Profesor crearProfe(String materia) {
			String[] nombresH = {"Juan", "Jose", "Sergio", "Daniel", "Fernando"};
			String[] nombresM = {"Maria", "Eva", "Laura", "Cristina", "Núria"};
			double n = Math.random() * 100;
			int nombre = (int)(Math.random()*(4-0+1));
			int edad = (int)(Math.random()*(60-30+1)+30);
			if(n < 50) {
				Profesor profesor = new Profesor(nombresH[nombre], edad, "Hombre", materia);
				return profesor;
			} else {
				Profesor profesor = new Profesor(nombresM[nombre], edad, "Mujer", materia);
				return profesor;
			}
		}
		
//		Método para crear alumnos con datos semi aleatorios
		private static Alumno[] crearAlumnos(int aforo, String materias) {
			Alumno[] alumnos = new Alumno[aforo];
			String[] nombresH = {"Kevin", "Iker", "Oscar", "Alberto", "Mario", "Joel", "Gabriel", "Aleix", "Samuel", "Gerdard"};
			String[] nombresM = {"Marina", "Laia", "Marta", "Alba", "Vanessa", "Alejandra", "Melanie", "Lorena", "Bárbara", "Claudia"};
			double n = 0;
			int nombre = 0;
			int edad = 0;
			double nota = 0;
			
			for (int i = 0; i < aforo; i++) {
				n = Math.random() * 100;
				nombre = (int)(Math.random()*(9-1+1)+1);
				edad = (int)(Math.random()*(32-18+1)+18);
				nota = Math.random()*(10);
				if(n < 50) {
					Alumno alumno = new Alumno(nombresH[nombre], edad, "Hombre", nota);
					alumnos[i] = alumno;
				} else {
					Alumno alumno = new Alumno(nombresM[nombre], edad, "Mujer", nota);
					alumnos[i] = alumno;
				}
			}
			return alumnos;
		}
		
//		Método para mostrar las aulas por pantalla
		private static void displayAulas(Aula[] aulas) {
			for (int i = 0; i < aulas.length; i++) {
				if(aulas[i].comprobarDisponibilidad()) {
					System.out.println(aulas[i]);
					System.out.println("******************************");
				} else {
					System.out.println("El aula "+aulas[i].getId()+" no está disponible para hacer clase.");
				}
			}
		}
		
//		**** TAREA 6 ****
		public static void metodoTarea6() {
			Hashtable<String, Espectador> asientos = new Hashtable<String, Espectador>();
//			Creamos una pelicula y un cine ya que solo tenemos una sala
			Pelicula pelicula = new Pelicula("Black Widow", 134, 12, "Cate Shortland");
			Cine cine = new Cine(pelicula, 7.5, 8, 9, asientos);
//			Variable con el número total de asientos
			int totalAsientos = cine.getColumnas()*cine.getFilas();
//			Variable con la que controlamos el bucle para crear y sentar espectadores
			boolean asientosLibres = true;
			
//			Bucle para generar los espectadores y sentarlos
			while(asientosLibres) {
//				Generamos un espectador nuevo y lo sentamos
				sentarEspectador(nuevoEspectador(cine), cine);
//				Mientras el hashtable donde guardamos los datos de los asientos tenga
//				menos entradas de datos que asientos a rellenar continuamos el bucle
				if(cine.getAsientos().size() < totalAsientos) {} else {	
					asientosLibres = false;
				}
			}
			System.out.print(cine);
		}
		
		private static Espectador nuevoEspectador(Cine cine) {
//			Variable para controlar el bucle y arrays con nombres
			String[] nombresH = {"Kevin", "Iker", "Oscar", "Alberto", "Mario", "Joel", "Gabriel", "Aleix", "Samuel", "Gerdard"};
			String[] nombresM = {"Marina", "Laia", "Marta", "Alba", "Vanessa", "Alejandra", "Melanie", "Lorena", "Bárbara", "Claudia"};
//			Variables para generar un espectador con datos aleatorios
			double n = Math.random() * 100;;
			int nombre = (int)(Math.random()*(9-1+1)+1);
			int edad = (int)(Math.random()*(50-8+1)+8);
			double dinero = Math.random()*(20-5+1)+5;
			
//			Generamos y devolvemos un espectador con datos semi aleatorios
			if(n < 50) {
				Espectador espectador = new Espectador(nombresH[nombre], edad, dinero);
				return espectador;
			} else {
				Espectador espectador = new Espectador(nombresM[nombre], edad, dinero);
				return espectador;
			}
			
		}
		
		private static void sentarEspectador(Espectador espectador, Cine cine) {
//			Variables para generar un asiento aleatorio
			int filaRandom = (int)(Math.random()*(cine.getFilas())+1);
			int columnasRandom = (int)(Math.random()*(cine.getColumnas())+1);
			String asiento = String.valueOf(filaRandom) + String.valueOf(columnasRandom);
			boolean sentado = false;
			
//			Bucle para comprobar si podemos sentar al espectador
			while(!sentado) {
				//Comprobamos que el espectador cumple con la edad mínima y tiene dinero para pagar la entrada, si no lo hace salimos del bucle
				if(espectador.getDinero() > cine.getEntrada() && espectador.getEdad() > cine.getPelicula().getEdadMin()) {
//					Comprobamos si el asiento aleatorio asignado esta libre
//					Si lo está sentamos al espectador y salimos del bucle, si no le asignamos un nuevo asiento aleatorio y se repite el bucle
					if(!cine.getAsientos().containsKey(asiento)) {
						cine.getAsientos().put(asiento, espectador);
						sentado = true;
					} else {
						filaRandom = (int)(Math.random()*(cine.getFilas())+1);
						columnasRandom = (int)(Math.random()*(cine.getColumnas())+1);
						asiento = String.valueOf(filaRandom) + String.valueOf(columnasRandom);
					}
				} else {
					sentado = true;
				}
			}
		}
}
