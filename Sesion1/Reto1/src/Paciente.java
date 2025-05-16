//MODELADO
package Hospital;

public class Paciente {
//    ATRIBUTOS
    String nombre;
    int edad;
    String expediente;

//    METODO DE MOSTRAR INFORMACION
    public void mostrarInformacion(){
        System.out.println("Información del paciente");
        System.out.println("Nombre del paciente " + nombre);
        System.out.println("Edad del paciente " + edad);
        System.out.println("Expediente del paciente " + expediente);
    }


}
