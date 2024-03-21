package poo.modelo.loja;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private double valor;
    private int qtdeEstoque;
    private int estoqueMinimo;
    private String imagem;

    private List<ItensComprados> itensComprados;
    private  List<ItensVitrine> itensVitrines;
    private Secao secao;

    public Produto(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }


    public List<ItensComprados> getItensComprados() {
        return itensComprados;
    }

    public void setItensComprados(List<ItensComprados> itensComprados) {
        this.itensComprados = itensComprados;
    }

    public List<ItensVitrine> getItensVitrines() {
        return itensVitrines;
    }

    public void setItensVitrines(List<ItensVitrine> itensVitrines) {
        this.itensVitrines = itensVitrines;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
    }

    public List<Produto> pesquisarProdutosBaixoEstoque(List<Produto> listaEstoque){
        List<Produto> listaBaixoEstoque = new ArrayList<>();
        for(Produto prod:listaEstoque)
        {
            if(prod.getEstoqueMinimo() > prod.getQtdeEstoque()){
                listaBaixoEstoque.add(prod);
            }
        }
        return  listaBaixoEstoque;
    }
}
