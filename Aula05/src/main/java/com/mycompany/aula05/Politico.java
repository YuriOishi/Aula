
package com.mycompany.aula05;

public class Politico {
    private String nome;
    private String partido;
    private String estado;
    private String funcao;

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
       
    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
        
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }
       
    public void apresentacao(){
        System.out.printf(
                "Nome: %s\nPartido: %s\nEstado: %s\nFuncao: %s\n" ,
                this.nome, this.estado, this.partido, this.funcao
        );
                        
    }
    
    
}
