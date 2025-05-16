import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path ruta = Paths.get("errores.log");
        Path rutaRegistroFallos = Paths.get("registro_fallos.txt");

        int totalLineas = 0;
        int contadorErrores = 0;
        int contadorWarnings = 0;

        try (BufferedReader br = Files.newBufferedReader(ruta)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    contadorErrores++;
                }
                if (linea.contains("WARNING")) {
                    contadorWarnings++;
                }
            }

            System.out.println("📊 Resumen del análisis de logs:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + contadorErrores);
            System.out.println("Cantidad de advertencias: " + contadorWarnings);

            int totalErroresYWarnings = contadorErrores + contadorWarnings;
            double porcentaje = totalLineas > 0
                    ? (totalErroresYWarnings * 100.0) / totalLineas
                    : 0.0;
            System.out.printf("Porcentaje de líneas con errores y advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.out.println("❌ Error al procesar el archivo: " + e.getMessage());

            // Guardar el mensaje de error en registro_fallos.txt
            try {
                String mensajeError = "Error al leer " + ruta.toAbsolutePath() + ": " + e.getMessage();
                Files.writeString(rutaRegistroFallos, mensajeError);
                System.out.println("⚠️ Se guardó el mensaje de error en " + rutaRegistroFallos.toAbsolutePath());
            } catch (IOException ex) {
                System.out.println("❌ No se pudo guardar el registro de fallos: " + ex.getMessage());
            }
        }
    }
}
