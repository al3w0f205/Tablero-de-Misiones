public class Mision {

    private String nombre;
    private int nivelAmenaza;
    private int heroes;
    private boolean urgente;

    public Mision(String nombre, int nivelAmenaza, int heroes, boolean urgente) {
        this.nombre = nombre;
        this.urgente = urgente;
        if (nivelAmenaza < 1) {
            this.nivelAmenaza = 1;
        } else if (nivelAmenaza > 10) {
            this.nivelAmenaza = 10;
        } else {
            this.nivelAmenaza = nivelAmenaza;
        }

        if (heroes < 0) {
            this.heroes = 0;
        } else if (heroes > 10) {
            this.heroes = 10;
        } else {
            this.heroes = heroes;
        }
    }

    public Mision() {
        this("Sin asignar", 1, 0, false);
    }

    public Mision(String nombre) {
        this(nombre, 1, 0, false);
    }

    public Mision(String nombre, int nivelAmenaza) {
        this(nombre, nivelAmenaza, 0, false);
    }

    public Mision(String nombre, int nivelAmenaza, int heroes) {
        this(nombre, nivelAmenaza, heroes, false);
    }

    public Mision(Mision otra) {
        this.nombre = otra.nombre;
        this.nivelAmenaza = otra.nivelAmenaza;
        this.heroes = otra.heroes;
        this.urgente = otra.urgente;
    }

    public boolean esCritica() {
        return this.nivelAmenaza >= 8;
    }

    public void reforzar(int cantidad) {
        if (cantidad > 0) {
           this.heroes += cantidad;
            if (this.heroes > 10) {
                this.heroes = 10;
            }
        }
    }

    public void mostrar() {
        String etiquetaUrgente = urgente ? " [URGENTE]" : "";
        System.out.println(nombre + " | amenaza " + nivelAmenaza + " | heroes " + heroes + etiquetaUrgente);
    }
}
