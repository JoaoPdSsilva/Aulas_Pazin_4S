package poo.modelos.loja;

import java.util.Date;

public class Vitrine {
    private Date dataInicio;
    private Date dataFim;
    private Integer id;

    public Vitrine(Date dataInicio, Date dataFim, Integer id){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
}
