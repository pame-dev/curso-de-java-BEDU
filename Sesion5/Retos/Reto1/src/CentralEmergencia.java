public class CentralEmergencia {
//    Instancia de cada tipo
    public static void main(String[] args){
        Ambulancia amb = new Ambulancia("Ambulancia", "Sofia");
        Patrulla pat = new Patrulla("Patrulla", "Luis");
        UnidadBomberos uni = new UnidadBomberos("Bomberos", "Ximena");


        System.out.println("");
        amb.iniciarOperacion();

        System.out.println("");
        pat.iniciarOperacion();

        System.out.println("");
        uni.iniciarOperacion();




    }
}
