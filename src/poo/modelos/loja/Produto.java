package poo.modelos.loja;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private double valor;
    private int qtdeEstoque;
    private int estoqueMinimo;
    private String imagem;

    public Produto(Integer id,
                   int qtdeEstoque,
                   int estoqueMinimo,
                   String nome,
                   String descricao,
                   String imagem,
                   double valor){
        this.id = id;
        this.qtdeEstoque = qtdeEstoque;
        this.estoqueMinimo = estoqueMinimo;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.valor = valor;
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
}
