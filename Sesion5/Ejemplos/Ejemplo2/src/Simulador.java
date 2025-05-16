public class Simulador {
    public static void main(String[] args) {
        AutoAutonomo tesla = new AutoAutonomo("Tesla");

        tesla.encender();          // Método heredado de Vehiculo
        tesla.iniciarAutonomia();  // Método propio con composición
    }
}