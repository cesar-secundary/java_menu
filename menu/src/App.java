
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in); // lee lo que el usuario escribe
        boolean exit = false; // la opcion salir sera falsa para que salgamos del bucle
        int option; // definimos opcion como entero

        while (!exit) { // si la opcion es falsa entra en el bucle
            System.out.println("1: opcion");
            System.out.println("2: opcion");
            System.out.println("3: opcion");
            System.out.println("4: salir");

            try {
                System.out.println("Escribe una opcion");
                option = sn.nextInt(); // las opciones seran numeros enteros

                switch (option) {
                    case 1:
                        System.out.println("opcion 1 selecionada");
                        break; // sale de la opcion

                    case 2:
                        System.out.println("Selecionaste la opcion 2");
                        break;

                    case 3:
                        System.out.println("opcion 3 selecionada");
                        break;

                    case 4:
                        exit = true;
                        System.out.println("Saliendo de la app");
                        sn.close();
                        break;

                    default:
                        System.out.println("numero incorrecto");
                        break;
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Introduce un numero");
                sn.next();
            }

        }
    }

}