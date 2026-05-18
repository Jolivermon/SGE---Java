import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner pantalla = new Scanner(System.in);

        // Variables para guardar datos

        int[] ids = new int[3];    // Hasta 100 Identificacoones
        String[] nombres = new String[3];    // Hasta 100 nombres de estudiantes

        int contador = 0;   // cuenta los estudiantes guardados
        boolean salir = false;   // Para que se mustre siempre el menú

        while (!salir) {

            System.out.println("         MENÚ");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Salir");

            try {   

                int numero = pantalla.nextInt();

                switch (numero) {

                    case 1:

                        System.out.print("Ingrese ID: ");
                        ids[contador] = pantalla.nextInt();   // escribe el ID del estudiante

                        pantalla.nextLine();  // limpia el enter que dejo nextInt()

                        System.out.print("Ingrese nombre: ");
                        nombres[contador] = pantalla.nextLine();  // escriebe el nombre

                        contador++;  // Aumenta los estudiantes ingresados 

                        System.out.println("Estudiante agregado.");
                        break;   // Termino este caso, salir a menu


                    case 2:

                        for (int i = 0; i < contador; i++) {// Recorre la lista de los estudiantes agregados

                            System.out.println( "ID: " + ids[i] + " Nombre: " + nombres[i]);// muestra los estudiantes en la pantalla
                        }

                        break;  // Termino este caso, salir a menu


                    case 3:

                        System.out.print("Ingrese ID a buscar: ");
                        int buscar = pantalla.nextInt();

                        boolean encontrado = false;  // Empieza diciendo que no lo encontró

                        for (int i = 0; i < contador; i++) {  // Buscar en la lista

                            if (ids[i] == buscar) {  // este ID es el que escribio el usuario?

                                System.out.println( "Estudiante encontrado: " + nombres[i] );

                                encontrado = true;  // si lo encontre
                            }
                        }

                        if (!encontrado) {
                             System.out.println("No encontrado.");  // si es no encontrado 
                        }

                        break;  // Termino este caso, salir a menu


                    case 4:

                        salir = true;
                        System.out.println("Saliendo...");

                        break;  // Termino este caso, salir a menu

                    default:  // si el usuario escribe un numero diferente de los casos

                        System.out.println("Opción inválida.");
                }

            } catch (Exception error) {  // Si el usuario escribe letras o símbolos en lugar de números

                System.out.println("Por favor ingrese solo números.");
                pantalla.nextLine();  // limpia el valor incorrecto

            }

        }

        pantalla.close();   // Cierra Scanner cuando termina el programa

    }

}