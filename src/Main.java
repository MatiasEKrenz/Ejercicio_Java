import java.util.ArrayList;
import java.util.List;

public class Main {


    private static List<Integrante> integrantes = new ArrayList<>();

    public static void main(String[] argc){

        agregarIntegrantes();

        for (Integrante i : integrantes) {

            System.out.println (i.getNombre());
        }
    }

    private static void agregarIntegrantes(){

        integrantes.add(new Integrante(0, "Matias", "Krenz", "matias.krenz@mercadolibre.com"));
        integrantes.add(new Integrante(1, "Federico", "Torres", "fede.torres@mercadolibre.com"));
        integrantes.add(new Integrante(2, "Rodrigo", "Vicente", "rodri.vicente@mercadolibre.com"));
        integrantes.add(new Integrante(3, "Guillermo", "Cook", "gillermo.cook@mercadolibre.com"));
        integrantes.add(new Integrante(4, "Marco", "Martinez", "marco.martinez@mercadolibre.com"));

    }
}
