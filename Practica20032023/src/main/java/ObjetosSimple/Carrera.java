package ObjetosSimple;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private String codigo;
    private int creditosMinimos;
    private ArrayList<Materia> materiasObligatorias;
    private ArrayList<Materia> materiasOptativas;

    public Carrera(String nombre, String codigo, int creditosMinimos,
                   ArrayList<Materia> materiasObligatorias,
                   ArrayList<Materia> materiasOptativas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditosMinimos = creditosMinimos;
        this.materiasObligatorias = materiasObligatorias;
        this.materiasOptativas = materiasOptativas;
    }

    public String getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }

    public Integer getCreditosMinimos(){
        return this.creditosMinimos;
    }

    public List<Materia> getMateriasObligatorias(){
        return this.materiasObligatorias;
    }
    public List<Materia> getMateriasOptativas(){
        return this.materiasOptativas;
    }
}
