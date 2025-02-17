
package model;

import java.util.ArrayList;
import java.util.Date;

public class Passageiros extends Pessoa {
    private String celularParente1;
    private String celularParente2;
    private boolean neceEspecial;
    private String tipoNeceEspecial;
     private ArrayList<Passagem> passagens;

    public Passageiros() {
    }

    public Passageiros(String celularParente1, String celularParente2, boolean neceEspecial, String tipoNeceEspecial, ArrayList<Passagem> passagens, int id, String nome, String cpf, String rg, Date nascimento, String sexo, String email, String celular, Endereco endereco) {
        super(id, nome, cpf, rg, nascimento, sexo, email, celular, endereco);
        this.celularParente1 = celularParente1;
        this.celularParente2 = celularParente2;
        this.neceEspecial = neceEspecial;
        this.tipoNeceEspecial = tipoNeceEspecial;
        this.passagens = passagens;
    }

    public String getCelularParente1() {
        return celularParente1;
    }

    public void setCelularParente1(String celularParente1) {
        this.celularParente1 = celularParente1;
    }

    public String getCelularParente2() {
        return celularParente2;
    }

    public void setCelularParente2(String celularParente2) {
        this.celularParente2 = celularParente2;
    }

    public boolean getNeceEspecial() {
        return neceEspecial;
    }

    public void setNeceEspecial(boolean neceEspecial) {
        this.neceEspecial = neceEspecial;
    }

    public String getTipoNeceEspecial() {
        return tipoNeceEspecial;
    }

    public void setTipoNeceEspecial(String tipoNeceEspecial) {
        this.tipoNeceEspecial = tipoNeceEspecial;
    }

    public ArrayList<Passagem> getPassagens() {
        return passagens;
    }

    public void setPassagens(ArrayList<Passagem> passagens) {
        this.passagens = passagens;
    }

    
    
}
