public class Alumno {
    private String nombre; // este objeto si no cambia con el tiempo es INMUTABLE
    private boolean estaInscripto;

    public Alumno(String nombre,Boolean estaInscripto) {
        this.nombre = nombre;
        this.estaInscripto = false;
    }

    public String getNombre(){
        return this.nombre;
    }
}
