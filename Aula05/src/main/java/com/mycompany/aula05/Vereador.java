
package com.mycompany.aula05;

public class Vereador extends Politico {
    private String municipio;

    public Vereador(String nome, String partido, String estado, String funcao, String municipio) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public void apresentacao() {
        super.apresentacao(); 
        System.out.printf("\nMunicipio: %s", this.municipio);
    }
    
    
    
}
