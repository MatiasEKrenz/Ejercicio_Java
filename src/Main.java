import java.util.ArrayList;
import java.util.List;


public class Main {


    private static List<Integrante> integrantes = new ArrayList<>();

    public static void main(String[] argc){

        agregarIntegrantes();

        System.out.println("\nVamos a imprimir todos los integrantes");

        todosLosIntegrantes();

        System.out.println("\nApellidos con L o G");

        apellidosL_G();

    }

    private static void agregarIntegrantes(){

        integrantes.add(new Integrante(0, "Matias", "Krenz", "matias.krenz@mercadolibre.com"));
        integrantes.add(new Integrante(1, "Federico", "Torres", "fede.torres@mercadolibre.com"));
        integrantes.add(new Integrante(2, "Rodrigo", "Licente", "rodri.vicente@mercadolibre.com"));
        integrantes.add(new Integrante(3, "Guillermo", "Gook", "gillermo.cook@mercadolibre.com"));
        integrantes.add(new Integrante(4, "Marco", "Martinez", "marco.martinez@mercadolibre.com"));

    }

    private static void todosLosIntegrantes(){

        integrantes.forEach(n -> System.out.println(n.getNombre() + " " + n.getApellido()));
        //ArrayList.stream(integrantes).forEach(num -> System.out.println(num));
    }

    private static void apellidosL_G(){

        integrantes
                .stream()
                .filter(s -> s.getApellido().startsWith("L"))
                .forEach(i -> System.out.println(i.getNombre() + " " + i.getApellido()));

        integrantes
                .stream()
                .filter(s -> s.getApellido().startsWith("G"))
                .forEach(i -> System.out.println(i.getNombre() + " " + i.getApellido()));
    }
}
