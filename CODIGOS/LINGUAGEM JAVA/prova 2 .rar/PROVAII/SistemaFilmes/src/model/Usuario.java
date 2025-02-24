package model;
public class Usuario {
   private int id;
   private String login;
   private String senha;
   private String perfil;
   private Funcionario funcionario;

    public Usuario() {
    }

    public Usuario(int id, String login, String senha, String perfil, Funcionario funcionario) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
   
}
