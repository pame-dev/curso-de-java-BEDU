// TransicionSimple.java
public class TransicionSimple implements Transicionhistoria {
    @Override
    public void siguienteEscena(String decision) {
        if (decision.equals("1")) {
            System.out.println("🌄 Transición a una escena pacífica en el bosque...");
        } else {
            System.out.println("⚔️ Transición a una emboscada enemiga en la noche...");
        }
    }
}
