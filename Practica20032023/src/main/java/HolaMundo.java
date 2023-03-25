import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        // formas de escribir enteros
        int x = 2;
        Integer y = 2; // esto es objeto, vive en el heap
        Integer z = new Integer(2); // es lo mismo que la línea 7

        // esto está en el heap
        Alumno[] arregloDeAlumnos = new Alumno[]{
                new Alumno("Diego",true),
                new Alumno("Pedro",false)
        };

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Nacho",false));
        alumnos.add(new Alumno("Juana",false));

        HashMap<String,Alumno> tablaAlumno = new HashMap();
        tablaAlumno.put("Luna", new Alumno("Luna",true));
        Alumno caro = new Alumno("Carolina",true);

        System.out.println("El nombre del alumno es: "+ caro.getNombre());
        System.out.println(arregloDeAlumnos[0].getNombre() +" "+ arregloDeAlumnos[1].getNombre());
        System.out.println(alumnos.get(1).getNombre());
        System.out.println(tablaAlumno.get("Luna").getNombre());

        /*
            Asociación es una flecha o línea continua. La universidad tiene muchos alumnos
            Agregación, un auto tiene ruedas -> el auto sin las ruedas no funciona. Es un diamante hueco y flecha
            Agregacion 🔹----- VACIO + linea continua.
            Composición tinee el mismo ciclo de vida. Cuando un objeto muere los otros que dependen de él, mueren.
            El objeto que tiene relación de composición es dueño del otro objeto. Los ciclos de vidas están ligados.
            Cada att del objeto que es dueño es privado.
            Dependencia raro usarlo
            Generalización, El gato es un Felino. Gato -> Felino, con linea continua y triangulo hueco. HERENCIA
            Realización, , con linea punteada y triangulo hueco
            Dependencia >> Asociación >> Agregación >> Composición
            AGREGACION Y COMPOSICIÓN SE USA MUCHO EN EL TP

            Una interfaz es un contrato, si o si, se debe implementar todo lo que tenga la interfaz

         */

        imprimirLista(alumnos);
    }

    // Ejemplo de polimorfismo, se puede recibir cualquier tipo de lista

    private static void imprimirLista(List<Alumno> alumnos){

        System.out.println("\nImpresion de lista");
        for (Alumno a : alumnos){
            System.out.println(a.getNombre());
        }

    }
}
