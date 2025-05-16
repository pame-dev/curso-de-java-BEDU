//MAIN EJECUTA EL PROGRAMA
package Hospital;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        Clase Scanner
        Scanner tecladoDatos = new Scanner(System.in);
//        Creacion de objeto
        Paciente paciente1 = new Paciente();

        System.out.println("Ingrese nombre del paciente: ");
        paciente1.nombre = tecladoDatos.nextLine();

        System.out.println("Ingrese edad del paciente: ");
        paciente1.edad = tecladoDatos.nextInt();
        tecladoDatos.nextLine();

        System.out.println("Ingrese número de expediente del paciente: ");
        paciente1.expediente = tecladoDatos.nextLine();

//        CERRAMOS SCANNER
        tecladoDatos.close();
//        LLAMAMOS AL METODO
        paciente1.mostrarInformacion();


    }
}
