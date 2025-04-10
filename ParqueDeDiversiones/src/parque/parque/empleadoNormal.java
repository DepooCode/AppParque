package parque;

import java.util.List;

class EmpleadoNormal extends Empleado {
    private List<String> listaCapacidades;

    public EmpleadoNormal(String id, String nombre, List<String> capacidades) {
        super(id, nombre);  
        this.listaCapacidades = capacidades;
    }

    public List<String> getListaCapacidades() {
        return listaCapacidades;
    }

    public void setListaCapacidades(List<String> capacidades) {
        this.listaCapacidades = capacidades;
    }

    public List<Turno> getTurnosAsignados() {
        return null; 
    }

    public void comprarTiquete(Tiquete tiquete) {
    }
}