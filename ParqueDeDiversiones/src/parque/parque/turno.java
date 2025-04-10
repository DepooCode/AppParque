package parque;

import java.util.Date;

class Turno {
    private Date fecha;
    private String tipoTurno;
    private LugarTrabajo lugarAsignado;

    public Turno(Date fecha, String tipoTurno, LugarTrabajo lugar) {
        this.fecha = fecha;
        this.tipoTurno = tipoTurno;
        this.lugarAsignado = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public LugarTrabajo getLugarAsignado() {
        return lugarAsignado;
    }

    public void setLugarAsignado(LugarTrabajo lugar) {
        this.lugarAsignado = lugar;
    }
}
