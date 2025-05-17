import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> registros = new HashSet<>();

        try {
            System.out.println("💻 Monitoreo de consumo de CPU");
            System.out.print("¿Cuántos servidores desea registrar?: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese el consumo de CPU del servidor #" + i + ": ");
                String entrada = scanner.nextLine();

                try {
                    int consumo = Integer.parseInt(entrada);

                    if (consumo < 0 || consumo > 100) {
                        System.out.println("❌ Error: el valor debe estar entre 0 y 100.");
                        i--; // Reintentar este índice
                        continue;
                    }

                    if (registros.contains(consumo)) {
                        System.out.println("⚠️ Advertencia: ese valor ya fue registrado.");
                        i--;
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoCriticoException("🔥 Alerta crítica: el consumo es de " + consumo + "%");
                    }

                    registros.add(consumo);
                    System.out.println("✅ Registro exitoso: " + consumo + "%");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: debe ingresar un número válido.");
                    i--;
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                    registros.add(95); // Registrar hasta el umbral permitido
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("❌ Error: debe ingresar un número entero válido para la cantidad.");
        } finally {
            scanner.close();
            System.out.println("📡 Monitoreo finalizado.");
        }
    }
}
