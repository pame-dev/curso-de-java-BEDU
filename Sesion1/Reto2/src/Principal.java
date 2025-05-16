public class Principal {
    public static void main(String[] args) {
//CREACIÓN DEL OBJETO
        // Crear un objeto de tipo Producto utilizando el constructor
//        TIPO ENTRADA
        Entrada_Record entrada1 = new Entrada_Record("Obra de teatro", 852.50);
        Entrada_Record entrada2 = new Entrada_Record("Obra de teatro", 342.50);
        Entrada_Record entrada3 = new Entrada_Record("Opera", 662.46);


// LLAMAR AL METODO
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();

    }
}
