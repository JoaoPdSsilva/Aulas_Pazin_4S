package poo.modelos.loja;

public class Secao {
    private Integer id;
    private String nome;

    public Secao(Integer id, String nome)
    {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
