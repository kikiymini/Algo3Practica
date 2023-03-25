package ObjetosSimple;

import java.util.ArrayList;

/*
Diseñar e implementar un sistema que permita contabilizar las materias aprobadas de un plan de estudios de FIUBA.
Cada materia de FIUBA tiene un código, un nombre y una cantidad de créditos, y puede ser obligatoria u optativa.
Una carrera está compuesta por un listado de materias (que pueden ser obligatorias u optativas), y una cantidad
mínima de créditos. Para terminar la carrera hay que aprobar todas las materias obligatorias y además cumplir
la cantidad de créditos.
El sistema ofrece sus servicios a múltiples usuarios. Cada usuario puede cursar cero, una o más carreras.
El sistema debe permitir al usuario inscribirse a una carrera, marcar materias como aprobadas y consultar
el estado de cada una de sus carreras.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Materias FIUBA");

        Materia algo1 = new Materia("75.01","Algoritmos 1",4);
        Materia algo2 = new Materia("75.02","Algoritmos 2",4);
        Materia algo3 = new Materia("75.03","Algoritmos 3",4);

        Materia circuitos = new Materia("66.01","Circuitos",5);
        Materia potencia = new Materia("66.01","Potencia",5);
        Materia antenas = new Materia("66.01","Antenas",5);

        ArrayList<Materia> obligatoriasInformatica = new ArrayList<Materia>();
        obligatoriasInformatica.add(algo1);
        obligatoriasInformatica.add(algo2);
        obligatoriasInformatica.add(algo3);

        ArrayList<Materia> optativasInformatica = new ArrayList<Materia>();
        optativasInformatica.add(circuitos);


        Carrera informatica = new Carrera("Informatica","10",16,obligatoriasInformatica,optativasInformatica);

    }
}
