package poo.modelo.loja;

import java.util.Date;

public class ItensVitrine {

    private Vitrine vitrine;

    private Produto produto;
    private  int qtdeDisponivel;

    public  ItensVitrine() {

    }


    public Produto getProduto() {

        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public Vitrine getVitrine() {
        return vitrine;
    }

    public void setVitrine(Vitrine vitrine) {
        this.vitrine = vitrine;
    }
}
