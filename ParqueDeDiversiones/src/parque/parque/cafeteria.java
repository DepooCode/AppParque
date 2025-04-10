package parque;

import java.util.TreeMap;

class Cafeteria extends Servicio {
    private boolean tieneCocinero;
    private TreeMap<Integer, String> comidaFacturadaVendida;

    public Cafeteria(String nombre, String tipo) {
        super(nombre, tipo);
        comidaFacturadaVendida = new TreeMap<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTieneCajero() {
        return tieneCajero;
    }

    public void setTieneCajero(boolean tieneCajero) {
        this.tieneCajero = tieneCajero;
    }

    public boolean isTieneCocinero() {
        return tieneCocinero;
    }

    public void setTieneCocinero(boolean tieneCocinero) {
        this.tieneCocinero = tieneCocinero;
    }

    public void venderFacturarComida(String comida, int precio) {
        comidaFacturadaVendida.put(precio, comida);
    }

    public TreeMap<Integer, String> getComidaFacturadaVendida() {
        return comidaFacturadaVendida;
    }
}
