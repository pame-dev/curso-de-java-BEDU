import java.util.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;

  class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;


    public  Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Orden natural:  Ordenar los temas por nombre (alfabético) y por prioridad (orden ascendente).
    @Override
    public int compareTo(Tema otra){
        return this.titulo.compareTo(otra.titulo);
    }

    @Override
    public String toString(){
        return "Tema: " + titulo + '\'' + ", prioridad: " + prioridad + '}';
    }

}


 class GestorTema{
    public static void main(String[] args){
//        Usa CopyOnWriteArrayList<Tema> para gestionar los temas activos.
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

//        Agregar temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));


        // Mostrar temas ordenados por título (orden natural)
        System.out.println("📚 Temas ordenados por título:");
        Collections.sort(temas); // Usa compareTo
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Ordenar temas por prioridad ascendente usando Comparator
        System.out.println("\n🔥 Temas ordenados por prioridad:");
        temas.sort(Comparator.comparingInt(t -> t.prioridad));
        for (Tema t : temas) {
            System.out.println(t);
        }

        //  recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        // Mostrar recursos
        System.out.println("\n🔗 Recursos compartidos por tema:");
        recursos.forEach((titulo, enlace) -> {
            System.out.println("Tema: " + titulo + " → Recurso: " + enlace);
        });
    }
}