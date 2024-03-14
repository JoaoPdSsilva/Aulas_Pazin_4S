package poo.modelos.loja;

import java.util.Date;

public class ItensVitrine {

    private Vitrine vitrine;

    public  ItensVitrine() {
        this.vitrine = new Vitrine(new Date(), new Date(), 1);
        vitrine.setDataInicio(new Date());
        vitrine.setDataFim(new Date());
        vitrine.setId(1);
    }

    public Integer getId() {
        return vitrine.getId();
    }



}
