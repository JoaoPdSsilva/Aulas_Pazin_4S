package poo.modelo.loja;

import java.util.Date;
import java.util.List;

public class Compra {

    public Compra(){

    }

    private Integer id;
    private boolean concluida;
    private Date dataCompra;
    private double valorFrete;
    private  Cliente cliente;
    private List<ItensComprados> itens;






    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
   }

   public double calcularValorFinal(){
        double  valorCompra = 0.0;
       for(ItensComprados item:itens){
           valorCompra += item.getQuantidade() * item.getValor();
       }
        return 0.0;
   }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensComprados> getItens() {
        return itens;
    }

    public void setItens(List<ItensComprados> itens) {
        this.itens = itens;
    }
}
