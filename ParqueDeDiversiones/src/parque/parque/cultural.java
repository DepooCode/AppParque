package parque;

import java.util.List;

class Cultural extends Atraccion {
    private int minEdad;

    public Cultural(String nombre, String exclusividad, String ubicacion, int cupoMaximo, 
                    int numeroEncargadosMin, boolean deTemporada, List<String> restriccionesClima, int minEdad) {
        super(nombre, exclusividad, ubicacion, cupoMaximo, numeroEncargadosMin, deTemporada, restriccionesClima);
        this.minEdad = minEdad;
    }

    public int getMinEdad() {
        return minEdad;
    }

    public void setMinEdad(int minEdad) {
        this.minEdad = minEdad;
    }

    @Override
    public boolean revisarRegistrarTiquete(Tiquete tiquete) {
        return true;
    }
}
