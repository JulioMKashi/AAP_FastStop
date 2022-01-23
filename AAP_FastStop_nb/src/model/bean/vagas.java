/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author Gustavo
 */
public class vagas {
    
    private int ID_vaga;
    private ec ID_ec;
    private String status_vaga;
    private String tamanho;
    private String tipo;

    public vagas() {
    }

    public vagas(ec ID_ec, String status_vaga, String tamanho, String tipo) {
        this.ID_ec = ID_ec;
        this.status_vaga = status_vaga;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
    

    public int getID_vaga() {
        return ID_vaga;
    }

    public void setID_vaga(int ID_vaga) {
        this.ID_vaga = ID_vaga;
    }

    public ec getID_ec() {
        return ID_ec;
    }

    public void setID_ec(ec ID_ec) {
        this.ID_ec = ID_ec;
    }

    public String getStatus_vaga() {
        return status_vaga;
    }

    public void setStatus_vaga(String status_vaga) {
        this.status_vaga = status_vaga;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
