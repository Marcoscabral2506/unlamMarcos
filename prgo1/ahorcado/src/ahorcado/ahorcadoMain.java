package ahorcado;
import java.util.*;

public class ahorcadoMain {
		public static void main(String[] args) {
			// jugador 1

			System.out.println("Ingrese el nombre del jugador 1");
			Scanner nombre = new Scanner(System.in);
			String name1 = nombre.nextLine();
			System.out.println("Ingrese la palabra del jugador 1 para que adivine el 2");
			String adivine = nombre.next();
			Jugador jugador1 = new Jugador(name1, adivine); // jugador 1

			// jugador 2
			System.out.println("Ingrese el nombre del jugador 2");
			Scanner nombre2 = new Scanner(System.in);
			String name2 = nombre.next();
			System.out.println("Ingrese la palabra del jugador 2 para que adivine el 1");
			String adivine2 = nombre.next();
			Jugador jugador2 = new Jugador(name2, adivine2); // jugador 2

			// harcodeo
			//Jugador jugador1 = new Jugador("pepe", "caca");  jugador 1
			//Jugador jugador2 = new Jugador("lean", "sexo");  jugador 2

			int turnos = 0;

			Scanner opcionn = new Scanner(System.in);
			String palabra1 = jugador1.getPalabra();
			// palabra jugador 1
			char[] letras1 = palabra1.toCharArray(); // palabra a vector char
			char[] guiones1 = new char[letras1.length]; // palabra con guiones

			// palabra jugador 2
			String palabra2 = jugador2.getPalabra(); // palabra del jugador 2
			char[] letras2 = palabra2.toCharArray(); // palabra a vector char
			char[] guiones2 = new char[letras2.length]; // palabra con guiones

			for (int i = 0; i < letras1.length; i++) {
				guiones1[i] = '_'; // init guiones
			}
			for (int i = 0; i < letras2.length; i++) {
				guiones2[i] = '_'; // init guiones
			}
			boolean victoria1 = false, victoria2 = false;

			int aciertoJugador1 = -1;
			int aciertoJugador2 = -1;
			// MENU JUEGO

			while (victoria1 == false && victoria2 == false && jugador1.getVidas() > 0 && jugador2.getVidas() > 0) {
				turnos++;
				if (turnos % 2 == 0) {
					int opcion = 0;
					System.out.println("\n-------------------------------\n");
					System.out.println("Turno de " + jugador1.getNombre());
					System.out.print("\nPalabra oculta: ");
					for(int i=0;i<guiones2.length;i++) { 
						System.out.print(guiones2[i]+" ");
					}
					
					System.out.println("\n1.Introducir por letras \n2.Arriesgar.");
					opcion = opcionn.nextInt();

					switch (opcion) {
					case 1:
						while (victoria1 == false) {
							System.out.println("Introduce letra");
							Scanner lector = new Scanner(System.in);
							char letraIntroducida = lector.next().charAt(0);
							int flag = 0;
							for (int i = 0; i < letras2.length; i++) {
								if (letras2[i] == letraIntroducida) {
									guiones2[i] = letraIntroducida;
									flag = 1;
								}
							}
							for(int i=0;i<guiones2.length;i++) { 
								System.out.print(guiones2[i]+" ");
							}
							if (flag != 1) {
								jugador1.perderVidas();
								System.out.println("Te quedan " + jugador1.getVidas() + " vidas.");
							}
							if (Arrays.equals(guiones2, letras2)) {
								System.out.println("Exito!");
								System.out.println("La palabra era " + palabra2);
								victoria1 = true;
							}

							if (jugador1.getVidas() == 0) {
								System.out.println("perdiste");
								break;
							}
							break;
						} // FIN WHILE
						break;
					case 2:
						// ARRIESGA JUGADOR 1
						Scanner teclado = new Scanner(System.in);
						System.out.println("ingrese la palabra: ");
						String palabraArriesgo = teclado.next();
						if (palabra2.equals(palabraArriesgo)) {
							System.out.println("Exito la palabra era " + palabra2);
							aciertoJugador1 = 1;
						} else {
							System.out.println("Esa no era la palabra");
							jugador1.perderVidas();
							System.out.println("Te quedan " + jugador1.getVidas() + " vidas.");
							aciertoJugador1 = 0;
							if (jugador1.getVidas() == 0) {
								System.out.println("El jugador 1" + jugador1.getNombre() + " se quedo sin vidas");
							}
						}
						break;
					default:
						System.out.println("Error!");
						break;

					}// switch
				} // if

				// JUGADOR 2
				else {

					int opcion = 0;

					System.out.println("\n-------------------------------\n");
					System.out.println("Turno de " + jugador2.getNombre());
					System.out.print("\nPalabra oculta: ");
					for(int i=0;i<guiones1.length;i++) { 
						System.out.print(guiones1[i]+" ");
					}
					System.out.println("\n1.Introducir por letras \n2.Arriesgar.");
					opcion = opcionn.nextInt();

					switch (opcion) {
					case 1:
						while (victoria2 == false) {
							System.out.println("Introduce letra");
							Scanner lector = new Scanner(System.in);
							char letraIntroducida = lector.next().charAt(0);
							int flag = 0;
							for (int i = 0; i < letras1.length; i++) {
								if (letras1[i] == letraIntroducida) {
									guiones1[i] = letraIntroducida;
									flag = 1;
								}
							}
							for(int i=0;i<guiones1.length;i++) { 
								System.out.print(guiones1[i]+" ");
							}
							if (flag != 1) {
								jugador2.perderVidas();
								System.out.println("Te quedan " + jugador2.getVidas() + " vidas.");
							}
							if (Arrays.equals(guiones1, letras1)) {
								System.out.println("Exito!");
								System.out.println("La palabra era " + palabra1);
								victoria2 = true;
							}

							if (jugador2.getVidas() == 0) {
								System.out.println("perdiste");
								break;
							}
							break;
						} // FIN WHILE
						break;
					case 2:

						// ACIERTO JUGADOR 2
						Scanner teclado = new Scanner(System.in);
						System.out.println("ingrese la palabra: ");
						String palabraArriesgo = teclado.next();
						if (palabra1.equals(palabraArriesgo)) {
							System.out.println("La palabra era " + palabra1);
							aciertoJugador2 = 1;
						} else {
							System.out.println("Esa no era la palabra");
							aciertoJugador2 = 0;
							jugador2.perderVidas();
							System.out.println("Te quedan " + jugador2.getVidas() + " vidas.");
							if (jugador2.getVidas() == 0) {
								System.out.println("El jugador 2" + jugador2.getNombre() + " se quedo sin vidas");
							}
						}
						break;
					default:
						System.out.println("Error");
						break;
					}

				}
				if (aciertoJugador1 == 1 && aciertoJugador2 == 1) {
					System.out.println("Empate");
					victoria1 = true;
					victoria2 = true;
				} else if (aciertoJugador2 == 0 && aciertoJugador1 == 1) { // fallo el 2
					System.out.println("Gana " + jugador1.getNombre());
					victoria1 = true; // gana el 1
				} else if (aciertoJugador2 == 1 && aciertoJugador1 == 0) { // falla el 1
					aciertoJugador2 = 0;
					System.out.println("Gana " + jugador2.getNombre());
					victoria2 = true;
					break;
				}

			}
		}
	}


