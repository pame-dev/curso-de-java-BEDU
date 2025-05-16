public class CentroControl {
    public static void main(String[] args) {
        Drone drone1 = new DroneVigilancia("DR-001");
        Drone drone2 = new DroneReparto("DR-002");

        drone1.despegar();
        drone1.ejecutarMision();
        drone1.aterrizar();

        System.out.println();

        drone2.despegar();
        drone2.ejecutarMision();
        drone2.aterrizar();
    }
}