package parque;

public class EmpleadoNormal extends Empleado {

    private String tipo;
    private int experiencia;

    public EmpleadoNormal(String id, String nombre, String tipo, int experiencia) {
        super(id, nombre);
        this.tipo = tipo;
        this.experiencia = experiencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}