// DecisionBinaria.java
import java.util.Scanner;

public class DecisionBinaria implements Logicadecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Explorar el bosque 🌲");
        System.out.println("2. Acampar en el lugar 🏕️");
        System.out.print("Elige (1 o 2): ");
        return scanner.nextLine();
    }
}

