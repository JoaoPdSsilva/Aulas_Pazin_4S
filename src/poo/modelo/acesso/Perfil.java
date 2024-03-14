package poo.modelo.acesso;

import java.util.List;

public class Perfil {
    private Integer id;
    private  String descricao;

    private List<UsuarioADM> usuarioPerfil;

    public Perfil() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<UsuarioADM> getUsuarioPerfil() {
        return usuarioPerfil;
    }

    public void setUsuarioPerfil(List<UsuarioADM> usuarioPerfil) {
        this.usuarioPerfil = usuarioPerfil;
    }
}
