
package com.mycompany.aula05;

public class Prefeito extends Politico {
    private String municipio;

    public Prefeito(String nome, String partido, String estado, String funcao, String municipio) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    //comment
    

    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.printf("\nMunicipio: %s", this.municipio);
    }
    
       
}
