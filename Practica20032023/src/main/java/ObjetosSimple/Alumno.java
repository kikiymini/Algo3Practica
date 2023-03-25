package ObjetosSimple;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private int padron;
    private ArrayList<Materia> materiasAprobadas;
    private ArrayList<Carrera> carrerasInscripto;

    public Alumno(String nombre, int padron){
        this.nombre = nombre;
        this.padron = padron;
    }

    public void inscribirUnaCarrera(Carrera carrera){
        boolean yaInscripto = false;
// == compara las direcciones de memoria, sirve equals para comparar el contenido de strings
        for (int i = 0; i < this.carrerasInscripto.size(); i++){
            if (this.carrerasInscripto.get(i).getCodigo().equals(carrera.getCodigo())) {
                yaInscripto = true;
                break;
            }
        }

        if(!yaInscripto){
            carrerasInscripto.add(carrera);
        }
    }

    public void agregarMateriaAprobada(Materia materia){
        boolean yaAprobada = false;

        for (int i = 0; i < this.materiasAprobadas.size(); i++){
            if (this.materiasAprobadas.get(i).getCodigo().equals(materia.getCodigo())) {
                yaAprobada = true;
                break;
            }
        }

        if(!yaAprobada){
            materiasAprobadas.add(materia);
        }
    }

    public List<Materia> getMateriaAprobada(){
        return this.materiasAprobadas;
    }
}
