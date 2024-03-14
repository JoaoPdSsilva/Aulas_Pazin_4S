package poo.modelo.loja;

public abstract class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;

    public Usuario (){

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean logar(){
        return true;

    }
}
