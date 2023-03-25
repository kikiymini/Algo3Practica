package ObjetosSimple;

public class Materia {
    private String codigo;
    private String nombre;
    private int creditos;

    public Materia(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getNombre(){
        return this.nombre;
    }
    public Integer getCreditos(){
        return this.creditos;
    }
    public String getCodigo(){
        return this.codigo;
    }
}
