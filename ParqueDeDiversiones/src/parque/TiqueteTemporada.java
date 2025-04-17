package parque;

import java.util.Date;

class TiqueteTemporada extends Tiquete {
    private Date fechaFin;

    public TiqueteTemporada(String id, CategoriaTiquete categoria, boolean fastPass, Date fechaFastPass, Date fechaFin) {
        super(id, categoria, fastPass, fechaFastPass);
        this.fechaFin = fechaFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
