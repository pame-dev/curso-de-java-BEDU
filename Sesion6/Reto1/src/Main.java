import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> especies = new ArrayList<>();
        especies.add("Homo sapiens");
        especies.add("Mus musculus");
        especies.add("Arabidopsis thaliana");
        especies.add("Homo sapiens"); // muestra replicada

        System.out.println("📥 Orden de llegada de las muestras (puede haber duplicados):");
        for (int i = 0; i < especies.size(); i++) {
            System.out.println((i + 1) + ". " + especies.get(i));
        }

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> tiposEspecies = new HashSet<>(especies);
        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : tiposEspecies) {
            System.out.println("- " + especie);
        }

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> investigador = new HashMap<>();
        investigador.put("M-001", "Dra. López");
        investigador.put("M-002", "Dr. Hernández");
        investigador.put("M-003", "Dra. Paula");

        System.out.println("\n🧑‍🔬 Relación de ID de muestra → Investigador:");
        for (Map.Entry<String, String> entrada : investigador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // Paso 4: Búsqueda por ID de muestra
        String idBuscar = "M-002"; // puedes cambiar este valor para probar
        System.out.println("\n🔍 Búsqueda de investigador por ID de muestra: " + idBuscar);
        if (investigador.containsKey(idBuscar)) {
            System.out.println("✅ Investigador responsable: " + investigador.get(idBuscar));
        } else {
            System.out.println("❌ ID de muestra no encontrado.");
        }
    }
}
