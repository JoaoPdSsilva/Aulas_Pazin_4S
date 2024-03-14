package poo.modelos.loja;

import java.util.Date;

public class Cliente extends Usuario{

    public Cliente(Integer id, String nome, String email, String senha) {
        super(id, nome, email, senha);
        
    }
    private Date dataNascimento;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
