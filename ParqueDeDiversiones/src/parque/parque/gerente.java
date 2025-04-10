package parque;

import java.util.List;

class Gerente extends Empleado {
    public Gerente(String id, String nombre) {
        super(id, nombre);
    }

    public void asignarTurno(EmpleadoNormal empleado, Turno turno) {
    }

    public void eliminarTurno(EmpleadoNormal empleado, Turno turno) {
    }

    public void agregarEmpleado(EmpleadoNormal empleado) {
    }

    public void eliminarEmpleado(EmpleadoNormal empleado) {
    }

    public EmpleadoNormal getEmpleado(EmpleadoNormal empleado) {
        return empleado;
    }

    public void agregarAtraccion(Atraccion atraccion) {
    }

    public void agregarEspectaculo(Espectaculo espectaculo) {
    }

    public void gestionarAtraccion(Atraccion atraccion) {
    }

    public void gestionarEspectaculo(Espectaculo espectaculo) {
    }

    public void eliminarAtraccion(Atraccion atraccion) {
    }

    public void eliminarEspectaculo(Espectaculo espectaculo) {
    }

    public List<Atraccion> getListaAtraccionesGest() {
        return null;
    }

    public List<Espectaculo> getListaEspectaculosGest() {
        return null;
    }

    public List<EmpleadoNormal> getListaEmpleadosGest() {
        return null;
    }

    public void comprarTiquete(Tiquete tiquete) {
    }
}