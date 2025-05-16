import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // 1. Definir la ruta del archivo de parámetros
        Path rutaArchivo = Paths.get("config/parametros.txt");

        // 2. Crear carpeta y archivo si no existen
        guardarParametros(rutaArchivo);

        // 3. Mostrar información del archivo como en el ejemplo
        System.out.println("📁 Ruta absoluta: " + rutaArchivo.toAbsolutePath());

        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ El archivo existe.");

            if (Files.isDirectory(rutaArchivo)) {
                System.out.println("📂 Es un directorio.");
            } else {
                System.out.println("📄 Es un archivo.");
            }

            System.out.println("🔒 ¿Se puede leer?: " + Files.isReadable(rutaArchivo));
            System.out.println("✏️ ¿Se puede escribir?: " + Files.isWritable(rutaArchivo));

            // 4. Leer y mostrar el contenido del archivo
            leerParametros(rutaArchivo);
        } else {
            System.out.println("❌ El archivo NO fue creado.");
        }
    }

    public static void guardarParametros(Path rutaArchivo) {
        try {
            // Crear carpeta si no existe
            Path carpeta = rutaArchivo.getParent();
            if (!Files.exists(carpeta)) {
                Files.createDirectories(carpeta);
                System.out.println("📂 Carpeta 'config/' creada.");
            }

            // Parámetros de simulación
            String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("📄 Archivo de parámetros guardado correctamente.");

        } catch (IOException e) {
            System.out.println("⚠️ Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static void leerParametros(Path rutaArchivo) {
        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("📖 Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("⚠️ Error al leer el archivo: " + e.getMessage());
        }
    }
}
