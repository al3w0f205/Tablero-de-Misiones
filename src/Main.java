public class Main {

    public static void main(String[] args) {

        System.out.println("===== TABLERO DE MISIONES (CON RETOS) =====");
        Mision m1 = new Mision();
        Mision m2 = new Mision("Rescate en Asgard");
        Mision m3 = new Mision("Defensa de Wakanda", 8);
        Mision m4 = new Mision("Asalto a Latveria", 15, 4, true);
        Mision m5 = new Mision("Patrulla fantasma", 5, -2);
        Mision m6 = new Mision(m4);
        m6.reforzar(15);
        m1.mostrar();
        System.out.println("¿Es crítica?: " + m1.esCritica());
        System.out.println();
        m2.mostrar();
        System.out.println("¿Es crítica?: " + m2.esCritica());
        System.out.println();
        m3.mostrar();
        System.out.println("¿Es crítica?: " + m3.esCritica());
        System.out.println();
        m4.mostrar();
        System.out.println("¿Es crítica?: " + m4.esCritica());
        System.out.println();
        m5.mostrar();
        System.out.println("¿Es crítica?: " + m5.esCritica());
        System.out.println();
        m6.mostrar();
        System.out.println("¿Es crítica?: " + m6.esCritica());
    }
}
