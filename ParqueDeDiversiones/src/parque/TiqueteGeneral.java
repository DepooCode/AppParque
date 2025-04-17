package parque;

import java.util.Date;




class TiqueteGeneral extends Tiquete {
    
    public TiqueteGeneral(String id, CategoriaTiquete categoria, boolean fastPass, Date fechaFastPass) {
        super(id, categoria, fastPass, fechaFastPass);
    }

}
