package parque;

import java.util.List;

public class Cultural extends Atraccion {

    private int minEdad;

    public Cultural(String nombre, String exclusividad, String ubicacion, int cupoMaximo,
                    int numEncargadosMin, List<String> restriccionesClima,
                    boolean enTemporada, int minEdad) {

        super(nombre, exclusividad, ubicacion, cupoMaximo, numEncargadosMin, restriccionesClima, enTemporada);
        this.minEdad = minEdad;
    }

    public int getMinEdad() {
        return minEdad;
    }

    public void setMinEdad(int minEdad) {
        this.minEdad = minEdad;
    }
}
