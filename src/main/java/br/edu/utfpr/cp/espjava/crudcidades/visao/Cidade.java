package br.edu.utfpr.cp.espjava.crudcidades.visao;

import javax.print.event.PrintJobAdapter;

public class Cidade {

    private String nome;
    private String estado;

    public Cidade(final String nome, final String estado){
        this.nome = nome;
        this.estado= estado;
    }
   /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
