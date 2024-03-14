package poo.modelo.loja;

import java.util.Date;
import java.util.List;

public class Vitrine {
    private Date dataInicio;
    private Date dataFim;
    private Integer id;

    private List<ItensVitrine> itensVitrine;
    public Vitrine(){
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

    public List<ItensVitrine> getItensVitrine() {
        return itensVitrine;
    }

    public void setItensVitrine(List<ItensVitrine> itensVitrine) {
        this.itensVitrine = itensVitrine;
    }
}
